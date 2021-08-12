package org.example

import scala.language.postfixOps

/*
1.	For a given list with integers, return a new list removing the elements at odd positions.
 */

object Remove_oddposition extends App{

  println("Number of Integers in the List : ")
  val number= scala.io.StdIn.readInt()
  var list :List[Int] = read(number)
  println("Result : ")
  remove(list,0)

  def read(num:Int):List[Int]={
    println("Enter List value : ")
    val array1=new Array[Int](num)
    array1.map(_ => scala.io.StdIn.readInt()).toList
  }
  def remove(list1:List[Int],x:Int):Int = {
    if(x<number) {
      if(x%2==1) {
        println(list1(x))
        remove(list1,x+1)
      }
    else remove(list1,x+1)
    }
    x
  }
}