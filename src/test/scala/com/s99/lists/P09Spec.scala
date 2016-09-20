package com.s99.lists

import org.specs2.mutable.Specification


class P09Spec extends Specification {

  val problem = new P09

  "packs the similar elements into sublists" in {
    problem.packV1(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    problem.packV2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  }

  "returns single element lists when they are no consecutive repeated elements" in {
    problem.packV1(List('a, 'b, 'c, 'a, 'd, 'e)) ==== List(List('a), List('b), List('c), List('a), List('d), List('e))
    problem.packV2(List('a, 'b, 'c, 'a, 'd, 'e)) ==== List(List('a), List('b), List('c), List('a), List('d), List('e))
  }

  "returns empty list when the given list is empty" in {
    problem.packV1(List()) ==== List()
    problem.packV2(List()) ==== List()
  }

}
