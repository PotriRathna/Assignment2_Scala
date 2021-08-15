package org.example

/*
Given a list, repeat each element in the list amount of times.
Test Case:
Number of times to repeat an integer  2
Elements in an Array [1, 2, 3]
Sample Output
List(1,1,2,2,3,3)
 */

object Repeat_Integer extends App {

  println("Number of Integers in the List : ")
  val number= scala.io.StdIn.readInt()
  var list :List[Int] = read(number)
  repeat(list)

  def read(num:Int):List[Int]={
    println("Enter List value : ")
    val array1=new Array[Int](num)
    array1.map(_ => scala.io.StdIn.readInt()).toList
  }
  def repeat(list2:List[Int]) : List[Int] =
    {
      println("Number of times to repeat :")
      val repeat = scala.io.StdIn.readInt()
      println(list2.flatMap(List.fill(repeat)(_)))
      list2
    }
}
