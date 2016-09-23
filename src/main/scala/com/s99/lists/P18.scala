package com.s99.lists

import scala.annotation.tailrec
/**
  * n is the number of elements in the input list
  *
  * - sliceV1
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  *
  * - sliceV2
  *   + NOT tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  *
  * - sliceV3
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  */
class P18 {
  def slice[T] = sliceV1[T] _

  def sliceV1[T](i: Int, k: Int, xs: List[T]): List[T] = {
    @tailrec
    def sliceV1(j: Int, xs: List[T], acc: List[T]): List[T] = {
      xs match {
        case y :: ys if j >= i && j < k => sliceV1(j + 1, ys, y :: acc)
        case y :: ys => sliceV1(j + 1, ys, acc)
        case Nil => acc.reverse
      }
    }

    sliceV1(0, xs, List.empty[T])
  }

  def sliceV2[T](i: Int, k: Int, xs: List[T]): List[T] = {
    xs.zipWithIndex.foldRight(List.empty[T])({
      case ((y, j), acc) if j >= i && j < k => y :: acc
      case ((y, _), acc) => acc
    })
  }

  def sliceV3[T](i: Int, k: Int, xs: List[T]): List[T] = {
    xs.drop(i).take(k - i)
  }
}
