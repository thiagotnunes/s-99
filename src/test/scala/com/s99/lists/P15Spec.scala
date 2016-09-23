package com.s99.lists

import org.specs2.mutable.Specification

class P15Spec extends Specification {

  val problem = new P15

  "repeats elements k times for the given list" in {
    problem.duplicateNV1(3, List('a, 'b, 'c, 'c, 'd)) ==== List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    problem.duplicateNV2(3, List('a, 'b, 'c, 'c, 'd)) ==== List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    problem.duplicateNV3(3, List('a, 'b, 'c, 'c, 'd)) ==== List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }

  "returns an empty list when an empty list is given" in {
    problem.duplicateNV1(3, List()) ==== List()
    problem.duplicateNV2(3, List()) ==== List()
    problem.duplicateNV3(3, List()) ==== List()
  }

  "returns empty list when k is less than 1" in {
    problem.duplicateNV1(-1, List('a, 'b, 'c, 'c, 'd)) ==== List()
    problem.duplicateNV2(-1, List('a, 'b, 'c, 'c, 'd)) ==== List()
    problem.duplicateNV3(-1, List('a, 'b, 'c, 'c, 'd)) ==== List()
  }
}
