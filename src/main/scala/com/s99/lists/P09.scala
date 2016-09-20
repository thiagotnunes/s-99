package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the input list
  *
  * - packV1
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  *
  * - packV2
  *   + NOT Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  */
class P09 {

  def pack[T] = packV1[T] _

  def packV1[T](xs: List[T]): List[List[T]] = {
    @tailrec
    def packV1(xs: List[T], acc: List[List[T]]): List[List[T]] = {
      (xs, acc) match {
        case (Nil, _) => acc.reverse
        case (y :: ys, a :: as) if a.headOption.contains(y) =>
          packV1(ys, (y :: a) :: as)
        case (y :: ys, _) => packV1(ys, List(y) :: acc)
      }
    }

    packV1(xs, List.empty[List[T]])
  }

  def packV2[T](xs: List[T]): List[List[T]] = {
    xs.foldRight(List.empty[List[T]])((e, acc) =>
      acc match {
        case a :: as if a.headOption.contains(e) => (e :: a) :: as
        case _ => List(e) :: acc
      }
    )
  }
}
