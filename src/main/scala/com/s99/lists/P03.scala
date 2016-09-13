package com.s99.lists

import scala.annotation.tailrec

class P03 {

  @tailrec
  final def nth[T](i: Int, xs: List[T]): Option[T] = {
    xs match {
      case _ if i < 0 => None
      case Seq() => None
      case y +: ys if i == 0 => Some(y)
      case y +: ys => nth(i - 1, ys)
    }
  }

}
