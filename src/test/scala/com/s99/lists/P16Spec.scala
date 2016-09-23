package com.s99.lists

import org.specs2.mutable.Specification

class P16Spec extends Specification {

  val problem = new P16

  "drops every kth element from the given list" in {
    problem.dropV1(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    problem.dropV2(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  }

  "returns an empty list when an empty list is given" in {
    problem.dropV1(3, List()) ==== List()
    problem.dropV2(3, List()) ==== List()
  }

}
