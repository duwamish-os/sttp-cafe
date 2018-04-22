import org.scalatest.FunSuite

import scalaz.concurrent.Task

// https://aappddeevv.gitbooks.io/test_private_book/content/cookbook/recipe-onfinish-for-task.html

class ScalazExamples extends FunSuite {

  test("scalaz") {

    val dispose = Task.delay(println("Cleanup!"))
    val cartCostTask = Task.delay(1 + 1)

    val badTask = Task.delay(throw new RuntimeException("Error calculating cost!"))

    cartCostTask.attempt.flatMap { costEither =>
      println(s"cart cost result: $costEither")
      dispose.flatMap(_ => costEither.fold(Task.fail, Task.now))
    }.unsafePerformSync

  }
}
