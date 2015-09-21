package chapter2

package chapter2

import org.scalatest._
import MyModule._

class MyModuleTest extends WordSpec with MustMatchers {

  "MyModule" must {

    "fib" must {

      "return 0 for 0" in {
        fib(0) must be(0)
      }

      "return 1 for 1" in {
        fib(1) must be(1)
      }

      "return 1 for 2" in {
        fib(2) must be(1)
      }

      "return 2 for 3" in {
        fib(3) must be(2)
      }

      "return 3 for 4" in {
        fib(4) must be(3)
      }

      "return 5 for 5" in {
        fib(5) must be(5)
      }

      "return 8 for 6" in {
        fib(6) must be(8)
      }
    }

    "fibTail" must {

      "return 0 for 0" in {
        fibTail(0) must be(0)
      }

      "return 1 for 1" in {
        fibTail(1) must be(1)
      }

      "return 1 for 2" in {
        fibTail(2) must be(1)
      }

      "return 2 for 3" in {
        fibTail(3) must be(2)
      }

      "return 3 for 4" in {
        fibTail(4) must be(3)
      }

      "return 5 for 5" in {
        fibTail(5) must be(5)
      }

      "return 8 for 6" in {
        fibTail(6) must be(8)
      }
    }

  }

}
