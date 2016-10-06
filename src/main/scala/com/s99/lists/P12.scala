package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the input list
  * k is the max number of encoded elements in a pair
  *
  * - decodeV1
  *   + Time complexity - O(n . k)
  *   + Space complexity - O(n . k)
  *
  * - decodeV2
  *   + Tail recursive
  *   + Time complexity - O(n . k)
  *   + Space complexity - O(n . k)
  */
class P12 {

  def decode[T] = decodeV2[T] _

  def decodeV1[T](xs: List[(Int, T)]): List[T] = {
    xs.flatMap({ case (k, e) => List.fill(k)(e) })
  }

  def decodeV2[T](xs: List[(Int, T)]): List[T] = {
    @tailrec
    def decodeV2(xs: List[(Int, T)], acc: List[T]): List[T] = {
      xs match {
        case Nil => acc
        case (1, e) :: ys => decodeV2(ys, e :: acc)
        case (k, e) :: ys => decodeV2((k - 1, e) :: ys, e :: acc)
      }
    }

    decodeV2(xs, List.empty[T]).reverse
  }
}
