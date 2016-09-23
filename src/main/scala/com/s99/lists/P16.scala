package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the input list
  *
  * - dropV1
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  *
  * - dropV2
  *   + NOT tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  */
class P16 {

  def drop[T] = dropV1[T] _

  def dropV1[T](k: Int, xs: List[T]): List[T] = {
    @tailrec
    def dropV1(i: Int, xs: List[T], acc: List[T]): List[T] = {
      (i % k, xs) match {
        case (_, Nil) => acc
        case (0, y :: ys) => dropV1(i + 1, ys, acc)
        case (_, y :: ys) => dropV1(i + 1, ys, y :: acc)
      }
    }

    dropV1(1, xs, List.empty[T]).reverse
  }

  def dropV2[T](k: Int, xs: List[T]): List[T] = {
    xs.zipWithIndex.foldRight(List.empty[T])({
      case ((x, i), acc) if (i + 1) % k == 0 => acc
      case ((x, _), acc) => x :: acc
    })
  }
}
