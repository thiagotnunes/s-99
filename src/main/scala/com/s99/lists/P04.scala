package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the list
  */
class P04 {

  // Time complexity - O(n)
  // Space complexity - O(1), since it is tail recursive
  def length[T](xs: List[T]): Int = {
    length(0, xs)
  }

  @tailrec
  private final def length[T](acc: Int, xs: List[T]): Int = {
    xs match {
      case Nil => acc
      case y :: ys => length(acc + 1, ys)
    }
  }
}
