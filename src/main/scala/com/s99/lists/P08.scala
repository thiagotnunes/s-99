package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the input list
  *
  * - compressV1
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n) (for the accumulator, since it is tail recursive)
  *
  * - compressV2
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n) (for the accumulator, since it is tail recursive)
  *
  * - compressV3
  *   + NOT tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n)
  */
class P08 {

  def compress[T] = compressV3[T] _

  def compressV1[T](xs: List[T]): List[T] = {
    @tailrec
    def compressV1(xs: List[T], acc: List[T]): List[T] = {
      xs match {
        case Nil => acc.reverse
        case y :: ys if acc.headOption.contains(y) => compressV1(ys, acc)
        case y :: ys => compressV1(ys, y :: acc)
      }
    }

    compressV1(xs, List())
  }

  def compressV2[T](xs: List[T]): List[T] = {
    xs.foldLeft(List.empty[T])((acc, e) => acc match {
      case `e` :: _ => acc
      case _ => e :: acc
    }).reverse
  }

  def compressV3[T](xs: List[T]): List[T] = {
    xs.foldRight(List.empty[T])((e, acc) => acc match {
      case `e` :: _ => acc
      case _ => e :: acc
    })
  }

}
