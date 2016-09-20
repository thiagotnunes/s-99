package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the list
  *
  * - last
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(1)
  */
class P01 {

  @tailrec
  final def last[T](xs: List[T]): Option[T] = {
    xs match {
      case Nil => None
      case y :: Nil => Some(y)
      case y :: ys => last(ys)
    }
  }

}
