package com.s99.lists

import org.specs2.mutable.Specification

class P05Spec extends Specification {

  val problem = new P05

  "returns reversed list" in {
    problem.reverseV1(List(1, 2, 3, 4, 5)) ==== List(5, 4, 3, 2, 1)
    problem.reverseV2(List(1, 2, 3, 4, 5)) ==== List(5, 4, 3, 2, 1)
  }

  "returns empty list when the given list is empty" in {
    problem.reverseV1(List()) ==== List()
    problem.reverseV2(List()) ==== List()
  }

}
