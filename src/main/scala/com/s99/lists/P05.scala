package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the list
  */
class P05 {

  // Time complexity - O(n)
  // Space complexity - O(1), since it is tail recursive
  def reverse[T](xs: List[T]): List[T] = {
    reverse(List(), xs)
  }

  @tailrec
  private def reverse[T](acc: List[T], xs: List[T]): List[T] = {
    xs match {
      case Nil => acc
      case y :: ys => reverse(y +: acc, ys)
    }
  }

}
