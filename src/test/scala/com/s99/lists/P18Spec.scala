package com.s99.lists

import org.specs2.mutable.Specification

class P18Spec extends Specification {

  val problem = new P18

  "returns slice from the list" in {
    problem.sliceV1(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('d, 'e, 'f, 'g)
    problem.sliceV2(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('d, 'e, 'f, 'g)
    problem.sliceV3(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('d, 'e, 'f, 'g)
  }

  "returns from the start of the input list when i is 0" in {
    problem.sliceV1(0, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'c, 'd, 'e, 'f, 'g)
    problem.sliceV2(0, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'c, 'd, 'e, 'f, 'g)
    problem.sliceV3(0, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'c, 'd, 'e, 'f, 'g)
  }

  "returns until the end of the input list when i is the list size" in {
    problem.sliceV1(3, 11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    problem.sliceV2(3, 11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    problem.sliceV3(3, 11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  }

  "returns the whole list when i is 0 and k is the list size" in {
    problem.sliceV1(0, 11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    problem.sliceV2(0, 11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    problem.sliceV3(0, 11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  }

  "returns the whole list when i is less than 0 and k is greater than the list size" in {
    problem.sliceV1(-1, 12, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    problem.sliceV2(-1, 12, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    problem.sliceV3(-1, 12, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  }

  "returns an empty list when an empty list is given" in {
    problem.sliceV1(3, 7, List()) ==== List()
    problem.sliceV2(3, 7, List()) ==== List()
    problem.sliceV3(3, 7, List()) ==== List()
  }

}
