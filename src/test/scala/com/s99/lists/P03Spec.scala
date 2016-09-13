package com.s99.lists

import org.specs2.mutable.Specification

class P03Spec extends Specification {

  val problem = new P03

  "returns the nth element of the list" in {
    problem.nth(2, List(1, 1, 2, 3, 5, 8)) ==== Some(2)
  }

  "returns the last element of the list when n is equal to the list size - 1" in {
    problem.nth(5, List(1, 1, 2, 3, 5, 8)) ==== Some(8)
  }

  "returns the last element of the list when n is 0" in {
    problem.nth(0, List(1, 1, 2, 3, 5, 8)) ==== Some(1)
  }

  "returns None when n is negative" in {
    problem.nth(-1, List(1, 1, 2, 3, 5, 8)) ==== None
  }

  "returns None when the list is empty" in {
    problem.nth(2, List()) ==== None
  }

  "returns None when the index is equal to the list size" in {
    problem.nth(2, List(1, 1)) ==== None
  }

  "returns None when the index is greater than the list size" in {
    problem.nth(3, List(1, 1)) ==== None
  }

}
