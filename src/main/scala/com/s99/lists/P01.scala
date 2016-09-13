package com.s99.lists

import scala.annotation.tailrec

class P01 {

  @tailrec
  final def last[T](xs: List[T]): Option[T] = {
    xs match {
      case Seq() => None
      case y +: Seq() => Some(y)
      case y +: ys => last(ys)
    }
  }

}
