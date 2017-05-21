object rationals {
  val x = new Rational(1, 2)
  x.numerator
}

val x = new Rational(1, 3)
x.numerator
val y = new Rational (5, 7)
val z = new Rational(3, 2)
x + y

-x
-y
-z

y - x
x - y
x - y - z

val x2 = new Rational(8, 12);

val strange = new Rational(4, 0);
strange + strange




class Rational(x: Int, y: Int) {
  require(y!=0, "denominator must be nonzero")

  private def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a%b)

  private val g = gcd(x, y);

  def numerator = x/g;

  def denominator = y/g;

  def +(that: Rational)  =
    new Rational(numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)

  def -(that: Rational)  = this + -that

  def <(that: Rational) = numerator * that.denominator < denominator * that.numerator;

  def max(that: Rational) = if(this < that) that else this

  def unary_- : Rational = new Rational(-numerator, denominator);

  override def toString = numerator + "/" + denominator;
}