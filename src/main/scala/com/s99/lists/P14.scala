package com.s99.lists

import scala.annotation.tailrec
/**
  * n is the number of elements in the input list
  *
  * - duplicateV1
  *   + Tail recusive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  *
  * - duplicateV2
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  *
  * - duplicateV3
  *   + NOT tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  *
  * - duplicateV4
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  *
  * - duplicateV5
  *   + NOT tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  */
class P14 {

  def duplicate[T] = duplicateV1[T] _

  def duplicateV1[T](xs: List[T]): List[T] = {
    xs.flatMap(x => List(x, x))
  }

  def duplicateV2[T](xs: List[T]): List[T] = {
    xs.foldLeft(List.empty[T])((acc, x) => x :: x :: acc).reverse
  }

  def duplicateV3[T](xs: List[T]): List[T] = {
    xs.foldRight(List.empty[T])((x, acc) => x :: x :: acc)
  }

  def duplicateV4[T](xs: List[T]): List[T] = {
    @tailrec
    def duplicateV4(xs: List[T], acc: List[T]): List[T] = {
      xs match {
        case y :: ys => duplicateV4(ys, y :: y :: acc)
        case Nil => acc
      }
    }

    duplicateV4(xs, List.empty[T]).reverse
  }

  def duplicateV5[T](xs: List[T]): List[T] = {
    xs match {
      case y :: ys => y :: y :: duplicateV5(ys)
      case Nil => Nil
    }
  }
}
