
import math.Ordering;
def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
  val n = xs.length / 2;
  if (n == 0) xs
  else {
    def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
      case (List(), _) => ys
      case (_, List()) => xs
      case (x :: xs1, y :: ys1) => {
        if (ord.lt(x, y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
      }
    }

    val (first, second) = xs splitAt n
    merge(msort(first), msort(second))
  }
}




val l1 = List(1, 2, 5)
val l2 = List(0, 3, 4, 7)


val l3 = List(2, 4, 2, 1, 8, 5, 9, 4);
msort(l3)

val l4 = List("apple", "orange", "mango", "papaya", "guava ")
msort(l4)
Ordering.String