package lejoow.interview.scala

/**
  * Created by jooan on 28/4/2017.
  */
object ScalaTestApp extends App{

  //1. Placeholder Syntax
  println(List(1, 2).map { i => i + 1 })
  println(List(1, 2).map(_ + 1))


  //2. Will these two print the same out puts? Yes/ No
  List(1, 2).map { i => println("Hi"); i + 1 }
  List(1, 2).map {
    println("Hi"); _ + 1
  }


  //3. Higher order list functions
  val nums = List(2, -4, 5, 7, 1)

  //3-a) from the list, find the elements that are larger than 0 using 'filter'
  val lessThanZeros = nums.filter(_ > 0)

  //3-b) partition the list into two lists, one with numbers larger than zero, and the other with numbers larger than or equal to 0
  val partitioned = nums.partition(_ >= 0)

  //3-c) drop evey items that are larger than 0
  val dropped = nums.dropWhile(_ > 0)

  println(lessThanZeros)
  println(partitioned)
  println(dropped)


  //4. Complete the factorial function
  def factorial(n: Int): Int =
    if (n > 1) factorial(n - 1) * n else n

  print(factorial(3))

  //5. Complete the above factorial using tailrec
  def factorialTailRec(n: Int): Int = {
    def loop(acc: Int, n: Int): Int = {
      if (n == 1) acc else loop(acc * n, n - 1)
    }

    loop(n - 1, n)
  }

  println(factorial(4) == 24)
  println(factorialTailRec(4) == 24)

  //6. Pattern Matching
  //Complete the following eval function that evaluates the given numeric expression
  //i.e.  when Number(3) is passed, 3 should be returned
  //      when Sum(Number(1), Number(2)) is passed, 3 should be returned
  trait Expression

  case class Number(n: Int) extends Expression

  case class Sum(e1: Expression, e2: Expression) extends Expression

  def eval(e: Expression): Int = ???
}
