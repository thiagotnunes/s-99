package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the list
  */
class P01 {

  // Time complexity - O(n)
  // Space complexity - O(1), since it is tail recursive
  @tailrec
  final def last[T](xs: List[T]): Option[T] = {
    xs match {
      case Nil => None
      case y :: Nil => Some(y)
      case y :: ys => last(ys)
    }
  }

}
