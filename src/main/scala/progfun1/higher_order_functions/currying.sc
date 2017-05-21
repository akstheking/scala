def prod(f: Int=>Int, a: Int, b: Int): Int = {
  def loop(a: Int, res: Int): Int =
    if (a > b) res else loop(a + 1, f(a) * res)
  loop(a, 1);
}

prod(x => x*x, 2, 4);

def fact(n: Int) =
  prod(x=>x, 1, n)

fact(0);

def gen(f: Int=>Int, f2: (Int , Int)=> Int, a: Int, b: Int, c: Int) = {
  def loop(a: Int, c: Int) : Int =
    if(a>b) c else loop(a+1, f2(f(a), c))
  loop(a, c);
}

gen(x=>x, (y,z)=>y*z, 2, 4, 1);
