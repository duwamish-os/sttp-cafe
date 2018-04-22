import com.softwaremill.sttp._
import org.scalatest.{FunSuite, Matchers}

import scalaz.concurrent.Task

class SttpExamples extends FunSuite with Matchers {

  test("using default") {

    val httpRequest = sttp
      .post(uri"http://httpbin.org/post")
      .body("Hello, world!")

    implicit val backend: SttpBackend[Id, Nothing] = HttpURLConnectionBackend()
    val httpResponse = httpRequest.send()

    httpResponse.body.isRight shouldBe true
  }

  test("scalaz example") {
    import com.softwaremill.sttp.asynchttpclient.scalaz._

    implicit val backend: SttpBackend[Task, Nothing] = AsyncHttpClientScalazBackend()

    val httpRequest = sttp
      .post(uri"http://httpbin.org/post")
      .body("Hello, world!")

    val httpResponse: Task[Response[String]] = httpRequest.send()

    val response = httpResponse.unsafePerformSync

    response.code shouldBe 200
    response.body.exists(b => b.startsWith("{")) shouldBe true
    println(response.body)
  }
}
