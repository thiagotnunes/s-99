package com.s99.lists

import org.specs2.mutable.Specification

class P07Spec extends Specification {

  val problem = new P07

  "flattens nested list structure" in {
    problem.flattenV1(List(List(1, 1), 2, List(3, List(5, 8)))) ==== List(1, 1, 2, 3, 5, 8)
    problem.flattenV2(List(List(1, 1), 2, List(3, List(5, 8)))) ==== List(1, 1, 2, 3, 5, 8)
  }

  "does nothing when list is already flattened" in {
    problem.flattenV1(List(1, 1, 2, 3, 5, 8)) ==== List(1, 1, 2, 3, 5, 8)
    problem.flattenV2(List(1, 1, 2, 3, 5, 8)) ==== List(1, 1, 2, 3, 5, 8)
  }

  "does nothing when list is empty" in {
    problem.flattenV1(List()) ==== List()
    problem.flattenV2(List()) ==== List()
  }

}
