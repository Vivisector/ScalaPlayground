package com.igori

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}
import java.util.LinkedList
import java.util.TimeZone

import scala.collection.JavaConversions
import scala.collection.mutable.ArrayBuffer

/**
  * Created by IgorIvaniuk on 26.11.2015.
  */
object Chapter3 extends App {

  println("Task 1")

  def numbersToArray(n: Int): Array[Int] = {
    val arr: Array[Int] = (0 until n).toArray
    arr
  }

  println(numbersToArray(5).mkString(" "))

  println("Task 2")

  var testArr = numbersToArray(16)
  for (i <- 0 until testArr.length) {
    if (i % 2 == 1) {
      val temp = testArr(i)
      testArr(i) = testArr(i - 1)
      testArr(i - 1) = temp
    }
  }
  println(testArr.mkString(" "))

  println("Task 3")

  testArr = numbersToArray(15)
  val newArr = for (i <- 0 until testArr.length)
    yield if (i % 2 == 1) testArr(i - 1)
    else {
      if (i == testArr.length - 1)
        testArr(i)
      else
        testArr(i + 1)
    }
  println(testArr.mkString(" "))
  println(newArr.mkString(" "))

  println("Task 4")
  var a = Array[Int](2, 2, 2, 6, -1, 9, 0, -4, -6)
  var ab = new ArrayBuffer[Int]()
  ab ++= (for {
    elem <- a
    if elem > 0
  }
    yield elem)
  ab ++= (for {
    elem <- a
    if elem <= 0
  }
    yield elem)
  println(ab.mkString(" "))

  println("Task 5")
  val d = Array[Double](2, 6, -1, 9, 0, -4, -6)
  println(d.sum / d.length)

  println("Task 6")
  println(a.sortWith(_ < _).mkString(" "))
  println(ab.sortWith(_ > _).mkString(" "))

  println("Task 7")
  println(a.distinct.mkString(" "))

  println("Task 9")
  val tz = for (elem <- TimeZone.getAvailableIDs()
                if (elem.startsWith("America/"))
  ) yield elem.stripPrefix("America/")
  println(tz.mkString(" "))
  val tzMap = TimeZone.getAvailableIDs().filter(_.startsWith("America/")).map(s => s.stripPrefix("America/"))
  println(tzMap.mkString(" "))

  println("Task 10")
  val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  val nativesForFlavors = flavors.getNativesForFlavors(Array(DataFlavor.imageFlavor))
  val vals = JavaConversions.asScalaBuffer(new LinkedList(nativesForFlavors.values()))
  println(vals.mkString(" "))
}
