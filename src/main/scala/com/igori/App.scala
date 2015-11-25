package com.igori

import scala.collection.immutable.StringOps
import scala.math.BigInt._
import scala.util.Random

/**
  * Hello world!
  *
  */
object Chapter1 extends App {
  var res: BigInt = 2;
  println(res.pow(1024))

  println("Yuriy" * 3)

  println(probablePrime(100, Random))

  println(probablePrime(100, Random).toString(36))

  var s = new StringOps("test string")
}

/**
  * Chapter 2
  */
object Chapter2 extends App {

  def signum(number: Int): Int = {
    if (number == 0)
      0
    else if (number > 0)
      1
    else
      -1
  }

  println("Signum: 5 = " + signum(5));
  println("Signum: 0 = " + signum(0));
  println("Signum: -1 = " + signum(-1));

}
