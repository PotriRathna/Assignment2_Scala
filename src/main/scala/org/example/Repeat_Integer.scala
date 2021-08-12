package org.example

/*
Given a list, repeat each element in the list amount of times.
Input Format : The first line contains the integer where is the number of times you need to repeat the elements.
The next lines each contain an integer. These are the elements in the array.
Output Format : each element of the original list times, each on a separate line.
You have to return the list/vector/array of integers.
The relative positions of the values should be the same as the original list provided in the input.

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
