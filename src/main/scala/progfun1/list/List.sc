
def init[T](xs: List[T]): List[T] = xs match {
  case List() => throw new Error("Empty.init")
  case List(x) => List()
  case y :: ys => y :: init (ys)
}


val l1 =  List()
val l2 = List(1)
val l3 = List(1, 2)
val l4 = List(1, 2, 3, 4)

//init(l1)
init(l2)
init(l3)
init(l4)
