package progfun1.data_and_abstraction

/**
  * Created by siakhil on 6/11/17.
  */
trait List[+T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]

  def prepend [U >: T](elem: U): List[U] = new Cons(elem, this)
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false;
}

object Nil extends List[Nothing] {
  def isEmpty = true;

  def head = throw new NoSuchElementException("Nil.head");

  def tail = throw new NoSuchElementException("Nil.tail");
}

object test {
  val x: List[String] = Nil;

  def f(xs: List[NonEmpty], y: Empty.type ) = xs prepend x
}

object List {

  //week5 (Type and pattern matching)
  def apply[T](x1: T, x2: T) = new Cons(x1, new Cons(x2, Nil ))

  def apply[T]() = Nil

}


