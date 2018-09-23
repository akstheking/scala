def msort(xs: List[Int]): List[Int] = {
  val n = xs.length/2;
  if (n == 0) xs else {
    val (first, second) = xs splitAt n
    merge(msort(first), msort(second))
  }
}

def merge(xs: List[Int], ys: List[Int]): List[Int] = {
  xs match {
    case List() => ys
    case x::xs1 => {
       ys match {
         case List() => xs
         case y::ys1 => {
           if (x<y) x::merge(xs1, ys)
           else y::merge(xs, ys1)
         }
      }
    }
  }
}


def merge2(xs: List[Int], ys: List[Int]) = {
  (xs, ys) match {
    case (List(), _) => ys
    case (_, List()) => xs
    case (x::xs1, y::ys1) => {
      if (x<y) x::merge(xs1, ys)
      else y::merge(xs, ys1)
    }
  }
}

val l1 = List(1, 2, 5)
val l2 = List(0, 3, 4, 7)

merge2(l1, l2)

val l3 = List(2, 4,2, 1,8,5,9,4);
msort(l3)