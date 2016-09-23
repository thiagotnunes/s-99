package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the input list
  *
  * - splitV1
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  *
  * - splitV2
  *   + NOT tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  *
  * - splitV3
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  */
class P17 {

  def split[T] = splitV1[T] _

  def splitV1[T](k: Int, xs: List[T]): (List[T], List[T]) = {
    @tailrec
    def splitV1(i: Int, xs: List[T], left: List[T], right: List[T]): (List[T], List[T]) = {
      xs match {
        case y :: ys if i < k => splitV1(i + 1, ys, y :: left, right)
        case y :: ys => splitV1(i + 1, ys, left, y :: right)
        case Nil => (left.reverse, right.reverse)
      }
    }

    splitV1(0, xs, List.empty[T], List.empty[T])
  }

  def splitV2[T](k: Int, xs: List[T]): (List[T], List[T]) = {
    xs.zipWithIndex.foldRight((List.empty[T], List.empty[T]))({
      case ((x, i), (left, right)) if i < k => (x :: left, right)
      case ((x, _), (left, right)) => (left, x :: right)
    })
  }

  def splitV3[T](k: Int, xs: List[T]): (List[T], List[T]) = {
    val partitionedLists = xs
      .zipWithIndex
      .partition(_._2 < k)

    (partitionedLists._1.map(_._1), partitionedLists._2.map(_._1))
  }

}
