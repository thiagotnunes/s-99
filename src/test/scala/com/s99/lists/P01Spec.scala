package com.s99.lists

import org.specs2.mutable.Specification

class P01Spec extends Specification {

  val problem = new P01

  "returns last element of the list" in {
    problem.last(List(1, 2, 3, 4)) ==== Some(4)
  }

  "returns the element of a single element list" in {
    problem.last(List(2)) ==== Some(2)
  }

  "return None when the list is empty" in {
    problem.last(List()) ==== None
  }

}
