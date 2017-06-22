import progfun1.data_and_abstraction._;


def singleton[T](elem: T) = new Cons[T](elem, new Nil[T]);


def getNthElement[T](list: List[T], n: Int): T = {
  var i: Int = 0;
  var temp = list
  while (!temp.isEmpty && i < n-1) {
    temp = temp.tail;
    i += 1;
  }
  if(temp.isEmpty) throw new ArrayIndexOutOfBoundsException(i);
  return temp.head;
}


def nthElement[T](list: List[T], n: Int): T = {
  if (list.isEmpty) throw new ArrayIndexOutOfBoundsException;
  else if(n == 0 ) list.head
  else nthElement(list.tail, n-1)
}

val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));

nthElement(list, 0)

nthElement(list, 1)

nthElement(list, 2)

nthElement(list, -1)

//getNthElement(list, 4)

//getNthElement(list, 5)


nthElement(list, -1)

List (1, 2)