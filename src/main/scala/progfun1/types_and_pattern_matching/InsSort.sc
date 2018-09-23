def isort(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case y::ys => insert(y, isort(ys))
}


def insert(i: Int, xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case y :: ys => {
    if (i < y) i :: xs
    else y :: insert(i, ys)
  }
}