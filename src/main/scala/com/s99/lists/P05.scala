package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the list
  *
  * - reverseV1
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(1)
  *
  * - reverseV2
  *   + NOT Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n) (accumulator and recursion)
  */
class P05 {

  def reverse[T] = reverseV2[T] _

  def reverseV1[T](xs: List[T]): List[T] = {
    @tailrec
    def reverse(acc: List[T], xs: List[T]): List[T] = {
      xs match {
        case Nil => acc
        case y :: ys => reverse(y +: acc, ys)
      }
    }

    reverse(List(), xs)
  }

  def reverseV2[T](xs: List[T]): List[T] = {
    xs.foldRight(List.empty[T])((e, acc) => acc :+ e)
  }
}
