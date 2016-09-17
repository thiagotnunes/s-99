package com.s99.lists

import scala.annotation.tailrec

/**
  * WARNING: Time / Space complexity values may be wrong
  * n is the number of elements in the input list
  * k is the max number of elements on the largest child list from the input
  * d is the depth of list nesting
  */
class P07 {
  val flatten = flattenV2(_: List[Any])

  // Time complexity - O((n . d) . (n + k)) (there is a recursive call for each n and for each d)
  // Space complexity - O(n) (for the accumulator mainly, since it is tail recursive)
  def flattenV1(xs: List[Any]): List[Any] = {

    @tailrec
    def flattenV1(acc: List[Any], xs: List[Any]): List[Any] = {
      xs match {
        case (z :: zs) :: ys => flattenV1(acc :+ z, zs ++ ys) // O(n) + O(n + k) = O(n + k)
        case y :: ys => flattenV1(acc :+ y, ys) // O(n)
        case Nil => acc // O(1)
      }
    }

    flattenV1(List(), xs)
  }

  // Time complexity - O((n . d) . (n + k))
  // Space complexity - O(n . d) (since it is not tail recursive)
  def flattenV2(xs: List[Any]): List[Any] = {
    xs match {
      case (z :: zs) :: ys => z +: flattenV2(zs ++ ys) // O(1) + O(n + k) = O(n + k)
      case y :: ys => y +: flattenV2(ys) // O(1)
      case Nil => Nil // O(1)
    }
  }
}
