import argonaut.Argonaut._
import argonaut._
import com.softwaremill.sttp.{sttp, _}
import org.scalatest.{FunSuite, Matchers}
import places.PlaceResponse

import scala.concurrent.Await
import scala.concurrent.duration._

class ScalaFutureCafeSpecs extends FunSuite with Matchers {

  val ApiKey = "_"

  import PlaceResponse._

  test("scala http example with scalaFuture as backend") {

    import com.softwaremill.sttp.asynchttpclient.future._

    implicit val backend = AsyncHttpClientFutureBackend()

    val CafeType = Some("cafe")
    val CafeTypeKey = Some("coffee")
    val LatLong = Some("47.626596,-122.352569")
    val Radius = Some("1500")

    val httpRequest = sttp
      .get(uri"https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=$LatLong&radius=$Radius&type=$CafeType&keyword=$CafeTypeKey&key=$ApiKey")

    val httpResponse = httpRequest.send()

    val response = Await.result(httpResponse, 4 seconds)

    response.code shouldBe 200
    response.body.exists(b => b.startsWith("{")) shouldBe true

    response.body.map { res =>

      val places = res.decodeOption[PlaceResponse]

      places.map(_.results.map(_.name)).getOrElse(List.empty).foreach {
        println
      }
    }

  }
}
