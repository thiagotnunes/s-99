package com.s99.lists

import org.specs2.mutable.Specification

class P04Spec extends Specification {

  val problem = new P04

  "returns the length of the list" in {
    problem.length(List.fill(1000000)(0)) ==== 1000000
  }

  "returns 0 when the list is empty" in {
    problem.length(List()) ==== 0
  }
}
