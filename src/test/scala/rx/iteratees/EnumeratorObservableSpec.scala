package rx.iteratees

import org.specs2.mutable._
import play.api.libs.iteratee
import rx.observables
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

class EnueratorObservableSpec extends Specification {

  def await[T](f: Future[T]): T = Await.result(f, Duration(1, SECONDS))

  "Observable from Enumerator" should {
    "produce values" in {
      val enumerator = iteratee.Enumerator(1, 2, 3, 4)
      pending
    }
  }

  "Observer from Iteratee" should {
    "consume values" in {
      pending
    }
  }
}

