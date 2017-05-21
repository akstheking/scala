(x: Int) => x*x;
def sum(x: Int, y: Int) = x + y;
sum(5,6);


def sum(f: Int => Int, a: Int, b: Int): Int =
 if (a > b) 0 else f(a) + sum(f, a+1, b)


def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b);


sumCubes(2, 5);


def sum_tail(f: Int => Int, a: Int, b: Int, res: Int): Int =
  if(a>b) res else sum_tail(f, a+1, b, f(a) + res);

def sumCubesTail(a: Int, b: Int) = sum_tail(x => x*x*x, a, b, 0);

sumCubesTail(2, 5);

def sum_tail2(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int =
    if (a > b) acc
    else loop(a + 1, acc + f(a));
  loop(a, 0);
}

def sumCubesTail2(a: Int, b: Int) = sum_tail2(x => x*x*x, a, b);

sumCubesTail2(2, 5);
