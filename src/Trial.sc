import scala.math._

println("Hello World")

val x = Pi * 2

println(s"Two times the value of pi is $x")

printf("Now you have %.16f problems.", Math.nextAfter(2.5, 2))

println(1 to 10)

println(15 until 20 by 4)

val list1 = 2 until 5

println(list1.toList)

println((-5).abs.min(7))

println("blah".capitalize)

println("blah " * 3)

val range = 1 to 6
println(range.filter(_ > 4))
println(range.map(_ * 2))

def add(x: Int, y: Int) = x + y

println(add(3, 4))


def add1(f: (Int, Int) => Int) = {
  f(1, 2)
}

println(add1(_ + _))

val add2: (Int, Int) => Int = _ + _

println(add2(2, 3))

var a, b = (0, 0)
var c = false

println(a, b, c)

(1 to 10).sum

val choice = "one"

choice match {
  case "one" => println("gotcha")
  case "two" => println("nope")
  case _ => println("missed")
}

val map1 = Map("one" -> 1, "two" -> 2, "three" -> 3)

println(map1("two"))

var immutableSet = Set(1, 2, 3)

immutableSet += 4

println(immutableSet)
