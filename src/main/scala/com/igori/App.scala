package com.igori

import scala.collection.immutable.StringOps
import scala.util.Random
import scala.math.BigInt._

/**
  * Hello world!
  *
  */
object MyApp extends App {
  var res: BigInt = 2;
  println(res.pow(1024))

  println("Yuriy"*3)

  println(probablePrime(100,Random))

  println(probablePrime(100, Random).toString(36))

  var s = new StringOps("test string")


}
