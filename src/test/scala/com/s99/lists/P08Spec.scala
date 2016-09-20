package com.s99.lists

import org.specs2.mutable.Specification

class P08Spec extends Specification {
  val problem = new P08

  "returns compressed list" in {
    problem.compressV1(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List('a, 'b, 'c, 'a, 'd, 'e)
    problem.compressV2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List('a, 'b, 'c, 'a, 'd, 'e)
    problem.compressV3(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List('a, 'b, 'c, 'a, 'd, 'e)
  }

  "returns same list when there are no duplicates" in {
    problem.compressV1(List('a, 'b, 'c, 'a, 'd, 'e)) ==== List('a, 'b, 'c, 'a, 'd, 'e)
    problem.compressV2(List('a, 'b, 'c, 'a, 'd, 'e)) ==== List('a, 'b, 'c, 'a, 'd, 'e)
    problem.compressV3(List('a, 'b, 'c, 'a, 'd, 'e)) ==== List('a, 'b, 'c, 'a, 'd, 'e)
  }

  "returns empty list when the given list is empty" in {
    problem.compressV1(List()) ==== List()
    problem.compressV2(List()) ==== List()
    problem.compressV3(List()) ==== List()
  }
}
