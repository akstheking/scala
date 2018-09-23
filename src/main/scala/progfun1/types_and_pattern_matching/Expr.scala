package progfun1.types_and_pattern_matching

/**
  * Created by siakhil on 6/23/17.
  */
trait Expr

case class Number(n: Int) extends Expr;

case class Sum(e1: Expr, e2: Expr) extends Expr;

case class Prod(e1: Expr, e2: Expr) extends Expr;

case class Var(x: String) extends Expr;


