package com.s99.lists

import org.specs2.mutable.Specification

class P10Spec extends Specification {

  val problem = new P10(new P09)

  "returns the run-length encoding of the list" in {
    problem.encodeV1(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    problem.encodeV2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }

  "returns 1 for all when there are no repeated elements" in {
    problem.encodeV1(List('a, 'b, 'c, 'a, 'd, 'e)) ==== List((1,'a), (1,'b), (1,'c), (1,'a), (1,'d), (1,'e))
    problem.encodeV2(List('a, 'b, 'c, 'a, 'd, 'e)) ==== List((1,'a), (1,'b), (1,'c), (1,'a), (1,'d), (1,'e))
  }

  "returns empty list when empty list is given" in {
    problem.encodeV1(List()) ==== List()
    problem.encodeV2(List()) ==== List()
  }
}
