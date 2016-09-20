package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the list
  *
  * - lengthV1
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(1)
  *
  * - lengthV2
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(1)
  */
class P04 {

  def length[T] = lengthV2[T] _

  def lengthV1[T](xs: List[T]): Int = {
    @tailrec
    def lengthV1(acc: Int, xs: List[T]): Int = {
      xs match {
        case Nil => acc
        case y :: ys => lengthV1(acc + 1, ys)
      }
    }

    lengthV1(0, xs)
  }

  def lengthV2[T](xs: List[T]): Int = {
    xs.foldLeft(0)((acc, _) => acc + 1)
  }
}
