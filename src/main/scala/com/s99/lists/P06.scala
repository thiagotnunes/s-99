package com.s99.lists

import scala.annotation.tailrec

/**
  * n is the number of elements in the list
  */
class P06 {

  def isPalindrome[T] = isPalindromeV2[T] _

  // Time complexity - O(n) (reverse)
  // Space complexity - O(n) (for the reversed list)
  def isPalindromeV1[T](xs: List[T]): Boolean = {
    xs == xs.reverse
  }

  // Time complexity - O(n)
  // Space complexity - O(1)
  def isPalindromeV2[T](xs: List[T]): Boolean = {
    val start = 0
    val end = xs.length - 1

    @tailrec
    def isPalindromeV2(i: Int, j: Int, xs: List[T]): Boolean = {
      if (i >= j) {
        true
      } else if (xs(i) != xs(j)) {
        false
      } else {
        isPalindromeV2(i + 1, j - 1, xs)
      }
    }

    isPalindromeV2(start, end, xs)
  }
}
