package progfun1.types_and_pattern_matching

/**
  * Created by siakhil on 6/17/17.
  */
abstract class Boolean {
  def ifThenElse[T](t: => T, e: T): T

  def && (x: => Boolean): Boolean = ifThenElse(x, FALSE)

  def || (x: => Boolean): Boolean = ifThenElse(TRUE, x)

  def unary_! : Boolean = ifThenElse(FALSE, TRUE)

  def == (x: Boolean) : Boolean = ifThenElse(x, x.unary_!)

  def != (x: Boolean) : Boolean = ifThenElse(x.unary_!, x)

  def < (x: Boolean) : Boolean = ifThenElse(FALSE , x)

}

object TRUE extends Boolean {
  override def ifThenElse[T](t: => T, e: T): T = t
}

object FALSE extends Boolean {
  override def ifThenElse[T](t: => T, e: T): T = e
}
