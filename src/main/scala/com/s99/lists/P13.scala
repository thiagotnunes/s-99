package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the input list
  *
  * - encodeDirectV1
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n) (for the accumulator)
  *
  * - encodeDirectV2
  *   + NOT Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  */
class P13 {

  def encodeDirect[T] = encodeDirectV1[T] _

  def encodeDirectV1[T](xs: List[T]): List[(Int, T)] = {
    @tailrec
    def encodeDirectV1(xs: List[T], acc: List[(Int, T)]): List[(Int, T)] = {
      (xs, acc) match {
        case (Nil, as) => as
        case ((y :: ys), (a :: as)) if y == a._2 => encodeDirectV1(ys, (a._1 + 1, a._2) :: as)
        case ((y :: ys), as) => encodeDirectV1(ys, (1, y) :: as)
      }
    }

    encodeDirectV1(xs, List.empty[(Int, T)]).reverse
  }

  def encodeDirectV2[T](xs: List[T]): List[(Int, T)] = {
    xs.foldRight(List.empty[(Int, T)])({
      case (y, (a :: as)) if y == a._2 => (a._1 + 1, a._2) :: as
      case (y, as) => (1, y) :: as
    })
  }

}
