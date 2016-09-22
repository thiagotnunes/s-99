package com.s99.lists

import org.specs2.mutable.Specification

class P12Spec extends Specification {

  val problem = new P12

  "decodes encoded list" in {
    problem.decodeV1(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) ==== List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    problem.decodeV2(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) ==== List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }

  "returns empty list when an empty list is given" in {
    problem.decodeV1(List()) ==== List()
    problem.decodeV2(List()) ==== List()
  }
}
