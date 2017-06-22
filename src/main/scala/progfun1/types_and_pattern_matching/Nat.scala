package progfun1.types_and_pattern_matching


/**
  * Created by siakhil on 6/17/17.
  */
abstract class Nat {
  def isZero: java.lang.Boolean
  def predecessor: Nat
  def successor = new Succ(this);
  def +(that: Nat): Nat
  def -(that: Nat): Nat

}

object zero extends Nat{
  override def isZero = true;

  override def predecessor: Nat = throw new Error("0.predecessor")

  override def +(that: Nat): Nat = new Succ(this)

  override def -(that: Nat): Nat = if (that.isZero) this else throw new Error("negative number")
}

class Succ(n: Nat) extends Nat {
  def isZero = false;

  override def predecessor: Nat = n;

  override def +(that: Nat): Nat = new Succ(n + that)

  override def -(that: Nat): Nat = if(that.isZero) n else n - that.predecessor
}
