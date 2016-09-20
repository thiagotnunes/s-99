package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the list
  *
  * - nth
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(1)
  */
class P03 {

  @tailrec
  final def nth[T](i: Int, xs: List[T]): Option[T] = {
    xs match {
      case _ if i < 0 => None
      case Nil => None
      case y :: ys if i == 0 => Some(y)
      case y :: ys => nth(i - 1, ys)
    }
  }

}
