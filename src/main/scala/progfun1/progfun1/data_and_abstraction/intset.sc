abstract class IntSet {
  def contains(x: Int): Boolean
  def incl(x: Int): IntSet
  def union(other: IntSet): IntSet
}

object Empty extends IntSet {
  def contains(x: Int) = false
  def incl(x: Int) = new NonEmpty(x, Empty, Empty)
  def union(other: IntSet) = other
  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if(x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int) =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if(x > elem) new NonEmpty(elem, left, right incl x)
    else this

  def union(other: IntSet) =


  override def toString = "{" + left + elem + right + "}"
}


val t1 = new NonEmpty(3, Empty, Empty)
val t2 = t1 incl 4
val t3 = t2 incl 5
