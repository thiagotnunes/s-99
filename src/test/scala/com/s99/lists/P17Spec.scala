package com.s99.lists

import org.specs2.mutable.Specification

class P17Spec extends Specification {

  val problem = new P17

  "splits the given list in two" in {
    problem.splitV1(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    problem.splitV2(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    problem.splitV3(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }

  "returns right empty list when k is equal to input list length" in {
    problem.splitV1(11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== (List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k), List())
    problem.splitV2(11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== (List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k), List())
    problem.splitV3(11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== (List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k), List())
  }

  "returns left empty list when k is less than 1" in {
    problem.splitV1(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== (List(), List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    problem.splitV2(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== (List(), List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    problem.splitV3(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==== (List(), List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }

  "returns a pair of empty lists when an empty list is given" in {
    problem.splitV1(3, List()) ==== (List(), List())
    problem.splitV2(3, List()) ==== (List(), List())
    problem.splitV3(3, List()) ==== (List(), List())
  }
}
