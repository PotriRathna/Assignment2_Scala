package org.example

/*
Update the values of a list with their absolute values.
Input Format
There are list of integers given in Sample Input. These are the elements of the input array.
Output Format
Output the absolute value of integers, each on a separate line.
Test Case :
List [2, -4, 3, -1, 23, -4, -54]
Sample Output
List(2,4,3,1,23,4,54)
 */

object Absolute_value extends App
{
  println("Number of Integers in the List : ")
  val number= scala.io.StdIn.readInt()
  var list :List[Int] = read(number)
  absolute(list,number)

  def read(num:Int):List[Int]={
    println("Enter List value : ")
    val array1=new Array[Int](num)
    array1.map(_ => scala.io.StdIn.readInt()).toList
  }
  def absolute(list1:List[Int],n:Int) : List[Int] =
    {
      println(" The Absolute Value of the  " +list1.map(scala.math.abs))
      list1
    }
}
