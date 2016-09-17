package com.s99.lists

import org.specs2.mutable.Specification

class P06Spec extends Specification {

  val problem = new P06

  "returns true when the list with odd n elements is a palindrome" in {
    problem.isPalindromeV1(List(1, 2, 3, 2, 1)) ==== true
    problem.isPalindromeV2(List(1, 2, 3, 2, 1)) ==== true
  }

  "returns true when the list with even n elements is a palindrome" in {
    problem.isPalindromeV1(List(1, 2, 2, 1)) ==== true
    problem.isPalindromeV2(List(1, 2, 2, 1)) ==== true
  }

  "returns true when the list has a single element" in {
    problem.isPalindromeV1(List(1)) ==== true
    problem.isPalindromeV2(List(1)) ==== true
  }

  "returns true when the list is empty" in {
    problem.isPalindromeV1(List()) ==== true
    problem.isPalindromeV2(List()) ==== true
  }

  "returns false when the list is not a palindrome" in {
    problem.isPalindromeV1(List(1, 2, 3, 4, 1)) ==== false
    problem.isPalindromeV2(List(1, 2, 3, 4, 1)) ==== false
  }

}
