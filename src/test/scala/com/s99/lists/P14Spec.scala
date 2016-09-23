package com.s99.lists

import org.specs2.mutable.Specification

class P14Spec extends Specification {

  val problem = new P14

  "duplicates elements of the given list" in {
    problem.duplicateV1(List('a, 'b, 'c, 'c, 'd)) ==== List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    problem.duplicateV2(List('a, 'b, 'c, 'c, 'd)) ==== List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    problem.duplicateV3(List('a, 'b, 'c, 'c, 'd)) ==== List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    problem.duplicateV4(List('a, 'b, 'c, 'c, 'd)) ==== List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    problem.duplicateV5(List('a, 'b, 'c, 'c, 'd)) ==== List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }

  "returns an empty list when an empty list is given" in {
    problem.duplicateV1(List()) ==== List()
    problem.duplicateV2(List()) ==== List()
    problem.duplicateV3(List()) ==== List()
    problem.duplicateV4(List()) ==== List()
    problem.duplicateV5(List()) ==== List()
  }
}
