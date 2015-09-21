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

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {

    @tailrec
    def _isSorted(n: Int): Boolean = {
      if(n == as.length-1) true
      else if(ordered(as(n), as(n+1))) false
      else _isSorted(n+1)
    }
    _isSorted(0)
  }

}
