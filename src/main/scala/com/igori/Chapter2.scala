package com.igori

/**
  * Created by Igor Ivaniuk on 25.11.2015.
  */
object Chapter2 extends App {

  // 1
  def signum(number: Int): Int = {
    if (number == 0)
      0
    else if (number > 0)
      1
    else
      -1
  }

  println("Task 1")
  println("Signum: 5 = " + signum(5));
  println("Signum: 0 = " + signum(0));
  println("Signum: -1 = " + signum(-1));

  // 2
  // Unit


  // 3
  var x: Unit = null;
  var y: Int = 0;
  x = y = 1;

  // 4
  println("Task 4")
  for (i <- 10 to 0 by -1)
    print(i)
  println()

  // 5
  println("Task 5")

  def countdown(n: Int): Unit = {
    for (i <- n to 0 by -1)
      print(i)
  }

  countdown(50)
  println()

  // 6
  println("Task 6")

  def unicodeMultiply(s: String): Long = {
    var result: Long = 1
    for (char <- s)
      result *= char
    result
  }

  println(unicodeMultiply("Hello"))

  // 7
  println("Task 7")

  def unicodeMultiplyNoFor(s: String): Long = {
    s.foldLeft(1L)((result, current) => result * current)
  }

  println(unicodeMultiplyNoFor("Hello"))

  // 9
  println("Task 9")

  def unicodeMultiplyRecursion(s: String): Long = {
    var result: Long = 1
    if (s.size > 0)
      s.head * unicodeMultiplyRecursion(s.tail)
    else
      1
  }

  println(unicodeMultiplyRecursion("Hello"))

  //10
  println("Task 10")

  def power(x: Double, n: Int): Double = {
    if (n == 0)
      1D
    else {
      if (n < 0)
        1 / power(x, -n)
      else {
        if (n % 2 == 0 && n > 2)
          power(power(x, n / 2), 2)
        else
          x * power(x, n - 1)
      }
    }
  }

  println(2 + " power " + -2 + " = " + power(2, -2))
}
