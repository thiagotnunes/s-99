package com.s99.lists

import scala.annotation.tailrec

/**
  *
  * n is the number of elements in the input list
  *
  * - encodeV1
  *   + Time complexity - O(n)
  *   + Space complexity - O(n) (from packer + map)
  *
  * - encodeV2
  *   + Tail recursive
  *   + Time complexity - O(n)
  *   + Space complexity - O(n) (from packer + acc)
  */
class P10(packer: P09) {
  def encode[T] = encodeV1[T] _

  def encodeV1[T](xs: List[T]): List[(Int, T)] = {
    packer
      .pack(xs)
      .map(x => (x.length, x.head))
  }

  def encodeV2[T](xs: List[T]): List[(Int, T)] = {
    @tailrec
    def encodeV2(xs: List[List[T]], acc: List[(Int, T)]): List[(Int, T)] = {
      xs match {
        case Nil => acc
        case y :: ys => encodeV2(ys, (y.length, y.head) :: acc)
      }
    }

    encodeV2(packer.pack(xs), List.empty[(Int, T)])
  }
}
