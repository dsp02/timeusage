println("Helo")
def factorial(n: Int): Int = {

  def loop(n:Int, accum:Int): Int =
  if (n == 0) accum else loop(n-1, n * accum) //n * factorial(n-1)

  loop(n, 1)
}

factorial(5)

def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

gcd(29,7)
gcd(7, 29)

(x:Int) => x*x*x

def slowRev(list: List[Int]): List[Int] = list match {
  case Nil => Nil
  case x :: xs => slowRev(xs) :+ x
}

slowRev(List(1,2,3,4,5,6))


val a = new Array[Int](10)
for (i <- 0 until a.length) a(i) = i * i
val result = for (elem <- a if elem <  5) yield elem * 2




import collection.mutable.ArrayBuffer
val b = new ArrayBuffer[Int]()
b += 1
b ++= List(2,3,4)
b.tail
b.remove(2)
val b2 = b.toArray
b2.sorted
b2.reverse
b2.toString
b2.mkString("/")

def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = {
  (x+y)*multiplier
}

val resA = addThenMultiply(3,4)(5)
println("@@@@@@@@" + resA)


