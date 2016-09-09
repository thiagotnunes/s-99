package com.s99.lists

class P01 {

  def last[T](xs: List[T]): Option[T] = {
    xs match {
      case Seq() => None
      case y +: Seq() => Some(y)
      case y +: ys => last(ys)
    }
  }

}
