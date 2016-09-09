package com.s99.lists

import org.specs2.mutable.Specification

class P02Spec extends Specification {

  val problem = new P02

  "returns penultimate element from list" in {
    problem.penultimate(List(1, 2, 3, 4, 5)) ==== Some(4)
  }

  "returns penultimate element from list with 2 members" in {
    problem.penultimate(List(1, 2)) ==== Some(1)
  }

  "returns None when the list contains a single element" in {
    problem.penultimate(List(1)) ==== None
  }

  "returns None when the list is empty" in {
    problem.penultimate(List()) ==== None
  }
}
