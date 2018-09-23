import progfun1.types_and_pattern_matching._

object expr {
  def show(e: Expr): String = e match {
    case Number(x) => x.toString
    case Sum(e1, e2) => show(e1) + " + " + show(e2)
    case Prod(e1, e2) =>
      val st1 = e1 match {
        case Sum(a, b) => "(" + show(Sum(a, b)) + ")"
        case _ => show(e1)
      }
      val st2 = e2 match {
        case Sum(a, b) => "(" + show(Sum(a, b)) + ")"
        case _ => show(e2)
      }
      st1 + " * " + st2
    case Var(v) => v
  }

  show(new Sum(new Number(3), new Number(4)))

  show(new Prod(new Var("x"), new Var("y")))


  show(Sum(Prod(Number(2),Var("x")),Var("y")))
  show(Prod(Sum(Number(2),Var("x")),Var("y")))
  show(Prod(Sum(Number(2),Var("x")),Sum(Number(3),Var("y"))))

}
