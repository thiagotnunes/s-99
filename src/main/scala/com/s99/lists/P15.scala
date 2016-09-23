package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the input list
  *
  * - duplicateNV1
  *   + Tail recursive
  *   + Time complexity - O(n . k) (flatMap is O(n) for lists)
  *   + Space complexity - O(n . k)
  *
  * - duplicateNV2
  *   + NOT Tail recursive
  *   + Time complexity - O(n . k)
  *   + Space complexity - O(n . k)
  *
  * - duplicateNV3
  *   + Tail recursive
  *   + Time complexity - O(n . k)
  *   + Space complexity - O(n . k)
  */
class P15 {

  def duplicateN[T] = duplicateNV3[T] _

  def duplicateNV1[T](k: Int, xs: List[T]): List[T] = {
    xs.flatMap(x => List.fill(k)(x))
  }

  def duplicateNV2[T](k: Int, xs: List[T]): List[T] = {
    xs.foldRight(List.empty[T])((x, acc) =>
      (0 until k).foldLeft(acc)((acc2, _) => x :: acc2)
    )
  }

  def duplicateNV3[T](k: Int, xs: List[T]): List[T] = {
    @tailrec
    def append(k: Int, x: T, acc: List[T]): List[T] = {
      if (k <= 0) {
        acc
      } else {
        append(k - 1, x, x :: acc)
      }
    }

    @tailrec
    def duplicateNV3(k: Int, xs: List[T], acc: List[T]): List[T] = {
      xs match {
        case y :: ys => duplicateNV3(k, ys, append(k, y, acc))
        case Nil => acc
      }
    }

    duplicateNV3(k, xs, List.empty[T]).reverse
  }
}
