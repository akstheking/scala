package example

/**
  * Created by siakhil on 08/02/17.
  */
object Example extends App{

  def abs(x:Double) = if(x < 0) -x else x

  def sqriter(guess : Double, x: Double):Double =
    if(isGoodEnough(guess, x)) guess
    else sqriter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x/guess)/ 2

  def sqrt(x: Double) = sqriter(1.0, x);

  println(sqrt(1));
  println(sqrt(.01));
  println(sqrt(1e60));
  println(sqrt(1));
  println(sqrt(1));

  var x =2;






}
