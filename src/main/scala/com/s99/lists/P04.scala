package com.s99.lists

import scala.annotation.tailrec

class P04 {

  def length[T](xs: List[T]): Int = {
    length(0, xs)
  }

  @tailrec
  private final def length[T](acc: Int, xs: List[T]): Int = {
    xs match {
      case Seq() => acc
      case y +: ys => length(acc + 1, ys)
    }
  }
}
