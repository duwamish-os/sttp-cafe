import com.softwaremill.sttp.{Response, SttpBackend, sttp}
import org.scalatest.{FunSuite, Matchers}

import com.softwaremill.sttp._

import scalaz.concurrent.Task
import argonaut._, Argonaut._

class ScalazCafeSpec extends FunSuite with Matchers {

  val ApiKey = "<KEY>"

  case class PlaceResponse(results: List[Place])

  case class Place(id: String,
                   name: String,
                   price_level: Int,
                   rating: Float,
                   vicinity: String,
                   types: List[String])

  implicit def PlaceCodecJson: CodecJson[Place] =
    casecodec6(Place.apply, Place.unapply)("id", "name", "price_level", "rating", "vicinity", "types")

  implicit def PlaceResponseJson: CodecJson[PlaceResponse] = casecodec1(PlaceResponse.apply, PlaceResponse.unapply)("results")

  test("deserialise") {
    val serialisedString =
      """
        |{
        |         "geometry" : {
        |            "location" : {
        |               "lat" : 47.6228195,
        |               "lng" : -122.3551413
        |            },
        |            "viewport" : {
        |               "northeast" : {
        |                  "lat" : 47.62416892989272,
        |                  "lng" : -122.3539342201073
        |               },
        |               "southwest" : {
        |                  "lat" : 47.62146927010728,
        |                  "lng" : -122.3566338798927
        |               }
        |            }
        |         },
        |         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |         "id" : "2f265092f0e0968dc407a9539815781395ce36ea",
        |         "name" : "La Marzocco Cafe",
        |         "opening_hours" : {
        |            "open_now" : false,
        |            "weekday_text" : []
        |         },
        |         "photos" : [
        |            {
        |               "height" : 1365,
        |               "html_attributions" : [
        |                  "\u003ca href=\"https://maps.google.com/maps/contrib/112118594871223347286/photos\"\u003eLa Marzocco Cafe\u003c/a\u003e"
        |               ],
        |               "photo_reference" : "CmRaAAAARXNxKt8spWWPmS8eRGe8Jzeas9XDV9JOs19Iz3nl6DWxKYkPCCQYyJsBpi_gDAjWYSaiOHer4yvOyR2Npqzd82xQhurmkosvrC9axC5kxrVOj6gpL9izTje7wK8B4fewEhDlN-uvw5ZjPoIekHsDSKfhGhTA7stU4cyp6WG5SRlz4uqCCQzlMw",
        |               "width" : 2048
        |            }
        |         ],
        |         "place_id" : "ChIJIbZXcUQVkFQRG6tzRinKJjQ",
        |         "price_level" : 1,
        |         "rating" : 4.7,
        |         "reference" : "CmRbAAAAgOvh9OYtKSn9eLXQOxYZLVs-XFAtX89oy7WdFF2_xesEj4qMhSPwxAqlfgZMxLIeTWM92yx-GXgDBHRJ5vw3m5M6MsC-t-jx4D_JH61rybjy0y-EQrev0TWULi7aF2xHEhDhgVK0se3UPmJ8JSadz0IUGhSo-48Thep9JGvYt-0N_e4LReztyQ",
        |         "scope" : "GOOGLE",
        |         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
        |         "vicinity" : "472 1st Ave N, Seattle"
        |      }
      """.stripMargin

    val deserialised = serialisedString.decodeOption[Place]

    deserialised.map(_.id) shouldBe Some("2f265092f0e0968dc407a9539815781395ce36ea")
    deserialised.map(_.name) shouldBe Some("La Marzocco Cafe")

  }

  test("deserialise nested") {
    val serialisedString =
      """
         {
           "unknownField": "",
           "results": [
            {
              "geometry" : {
                 "location" : {
                    "lat" : 47.6228195,
                    "lng" : -122.3551413
                 },
                 "viewport" : {
                    "northeast" : {
                       "lat" : 47.62416892989272,
                       "lng" : -122.3539342201073
                    },
                    "southwest" : {
                       "lat" : 47.62146927010728,
                       "lng" : -122.3566338798927
                    }
                 }
              },
              "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
              "id" : "1",
              "name" : "Cafe1",
              "opening_hours" : {
                 "open_now" : false,
                 "weekday_text" : []
              },
              "photos" : [
                 {
                    "height" : 1365,
                    "html_attributions" : [
                       "\u003ca href=\"https://maps.google.com/maps/contrib/112118594871223347286/photos\"\u003eLa Marzocco Cafe\u003c/a\u003e"
                    ],
                    "photo_reference" : "CmRaAAAARXNxKt8spWWPmS8eRGe8Jzeas9XDV9JOs19Iz3nl6DWxKYkPCCQYyJsBpi_gDAjWYSaiOHer4yvOyR2Npqzd82xQhurmkosvrC9axC5kxrVOj6gpL9izTje7wK8B4fewEhDlN-uvw5ZjPoIekHsDSKfhGhTA7stU4cyp6WG5SRlz4uqCCQzlMw",
                    "width" : 2048
                 }
              ],
              "place_id" : "ChIJIbZXcUQVkFQRG6tzRinKJjQ",
              "price_level" : 1,
              "rating" : 4.7,
              "reference" : "CmRbAAAAgOvh9OYtKSn9eLXQOxYZLVs-XFAtX89oy7WdFF2_xesEj4qMhSPwxAqlfgZMxLIeTWM92yx-GXgDBHRJ5vw3m5M6MsC-t-jx4D_JH61rybjy0y-EQrev0TWULi7aF2xHEhDhgVK0se3UPmJ8JSadz0IUGhSo-48Thep9JGvYt-0N_e4LReztyQ",
              "scope" : "GOOGLE",
              "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
              "vicinity" : "472 1st Ave N, Seattle"
             },
             {
               "id" : "2",
               "name" : "Cafe2",
               "unknown": "",
               "price_level" : 1,
               "rating" : 4.7,
               "vicinity" : "472 1st Ave N, Seattle",
               "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ]
             }
           ]
         }
      """.stripMargin

    val deserialised = serialisedString.decodeOption[PlaceResponse]

    deserialised.map(_.results.map(_.id)) shouldBe Some(List("1", "2"))
    deserialised.map(_.results.map(_.name)) shouldBe Some(List("Cafe1", "Cafe2"))

  }

  test("google api") {

    import com.softwaremill.sttp.asynchttpclient.scalaz._

    implicit val backend: SttpBackend[Task, Nothing] = AsyncHttpClientScalazBackend()

    val CafeType = Some("cafe")
    val CafeTypeKey = Some("coffee")
    val LatLong = Some("47.626596,-122.352569")
    val Radius = Some("1500")

    val httpRequest = sttp
      .get(uri"https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=$LatLong&radius=$Radius&type=$CafeType&keyword=$CafeTypeKey&key=$ApiKey")

    val httpResponse: Task[Response[String]] = httpRequest.send()

    val response = httpResponse.unsafePerformSync

    response.code shouldBe 200
    response.body.exists(b => b.startsWith("{")) shouldBe true

    response.body.map { res =>
      println(res)
      val places = res.decodeOption[PlaceResponse]
      println(places)
      places.map(_.results.map(_.name)).foreach {
        println
      }
    }

  }
}
