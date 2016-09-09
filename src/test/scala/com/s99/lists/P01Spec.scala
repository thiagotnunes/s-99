package com.s99.lists

import org.specs2.mutable.Specification

class P01Spec extends Specification {

  val p01 = new P01

  "returns last element of the list" in {
    p01.last(List(1, 2, 3, 4)) ==== Some(4)
  }

  "returns the element of a single element list" in {
    p01.last(List(2)) ==== Some(2)
  }

  "return null when the list is empty" in {
    p01.last(List()) ==== None
  }

}
