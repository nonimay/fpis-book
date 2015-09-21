package chapter2

import scala.annotation.tailrec

object MyModule {

  def fib(n: Int): Int = {
    if (n < 2) n
    else fib(n - 1) + fib(n - 2)
  }

  def fibTail(n: Int): Int = {

    @tailrec
    def _fib(count: Int, value: Int, sum: Int = 0): Int = {
      count match {
        case 0 => sum
        case _ => _fib(count - 1, sum, value + sum)
      }
    }

    _fib(n, 1)
  }

}
