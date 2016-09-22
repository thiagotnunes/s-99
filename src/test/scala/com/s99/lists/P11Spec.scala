package com.s99.lists

import org.specs2.mutable.Specification

class P11Spec extends Specification {
  val problem = new P11(new P09, new P10(new P09))

  "returns modified run-length encoding" in {
    problem.encodeModifiedV1(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    problem.encodeModifiedV2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  }

  "returns unmodified list when there are no repeated elements" in {
    problem.encodeModifiedV1(List('a, 'b, 'c, 'a, 'd, 'e)) ==== List('a, 'b, 'c, 'a, 'd, 'e)
    problem.encodeModifiedV2(List('a, 'b, 'c, 'a, 'd, 'e)) ==== List('a, 'b, 'c, 'a, 'd, 'e)
  }

  "returns empty list when empty list is given" in {
    problem.encodeModifiedV1(List()) ==== List()
    problem.encodeModifiedV2(List()) ==== List()
  }
}
