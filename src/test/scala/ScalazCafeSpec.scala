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
        |      {
        |         "id" : "2f265092f0e0968dc407a9539815781395ce36ea",
        |         "name" : "La Marzocco Cafe",
        |         "price_level" : 1,
        |         "rating" : 4.7,
        |         "vicinity" : "472 1st Ave N, Seattle",
        |         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ]
        |      }
      """.stripMargin

    val deserialised = serialisedString.decodeOption[Place]

    deserialised.map(_.id) shouldBe Some("2f265092f0e0968dc407a9539815781395ce36ea")
    deserialised.map(_.name) shouldBe Some("La Marzocco Cafe")

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

    }

  }
}
