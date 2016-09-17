package com.s99.lists

import org.specs2.mutable.Specification

class P04Spec extends Specification {

  val problem = new P04

  "returns the length of the list" in {
    problem.lengthV1(List.fill(1000000)(0)) ==== 1000000
    problem.lengthV2(List.fill(1000000)(0)) ==== 1000000
  }

  "returns 0 when the list is empty" in {
    problem.lengthV1(List()) ==== 0
    problem.lengthV2(List()) ==== 0
  }
}
