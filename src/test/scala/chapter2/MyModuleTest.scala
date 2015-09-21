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

    "isSorted" must {

      "return true is list has only one element" in {
        val array = Array(1)
        val sorted = isSorted(array, (x: Int, y: Int) => x > y)
        sorted must be(true)
        val sorted2 = isSorted(array, (x: Int, y: Int) => x < y)
        sorted2 must be(true)
      }

      "return true when sorted" in {
        val array = Array(1, 2)
        val sorted = isSorted(array, (x: Int, y: Int) => x > y)
        sorted must be(true)
        val array2 = Array(2, 1)
        val sorted2 = isSorted(array2, (x: Int, y: Int) => x < y)
        sorted2 must be(true)
      }

      "return false when not sorted" in {
        val array = Array(1, 2)
        val sorted = isSorted(array, (x: Int, y: Int) => x < y)
        sorted must be(false)
        val array2 = Array(2, 1)
        val sorted2 = isSorted(array2, (x: Int, y: Int) => x > y)
        sorted2 must be(false)
      }

      "return true when the elements are equal" in {
        val array = Array(1, 1)
        val sorted = isSorted(array, (x: Int, y: Int) => x > y)
        sorted must be(true)
      }

      "works for other types" in {
        val array = Array("abc", "abb", "aaa")
        val sorted = isSorted(array, (x: String, y: String) => x < y)
        sorted must be(true)
      }
    }
  }

}
