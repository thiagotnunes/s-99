package com.s99.lists

/**
  * n is the number of elements in the input list
  *
  * - encodeModifiedV1
  *   + Time complexity - O(n)
  *   + Space complexity - O(n) (from packer + map)
  *
  * - encodeModifiedV2
  *   + Time complexity - O(n)
  *   + Space complexity - O(n) (from encoder + map)
  */
class P11(packer: P09, encoder: P10) {
  def encodeModified[T] = encodeModifiedV1[T] _

  def encodeModifiedV1[T](xs: List[T]): List[Any] = {
    packer
      .pack(xs)
      .map({
        case List(y) => y
        case ys => (ys.length, ys.head)
      })
  }

  def encodeModifiedV2[T](xs: List[T]): List[Any] = {
    encoder
      .encode(xs)
      .map({
        case (1, e) => e
        case ys => ys
      })
  }
}
