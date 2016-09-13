package com.s99.lists

import scala.annotation.tailrec

class P05 {

  // n is the number of elements on the list
  // Time complexity - O(n)
  // Space complexity - O(1), since it is tail recursive
  def reverse[T](xs: List[T]): List[T] = {
    reverse(List(), xs)
  }

  @tailrec
  private def reverse[T](acc: List[T], xs: List[T]): List[T] = {
    xs match {
      case Seq() => acc
      case y +: ys => reverse(y +: acc, ys)
    }
  }

}
