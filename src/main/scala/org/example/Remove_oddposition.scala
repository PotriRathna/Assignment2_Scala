/*
1.	For a given list with integers, return a new list removing the elements at odd positions.
 Sample Input
	List [ 2, 5, 3, 4, 6, 7, 8, 9]
Sample Output
5
4
7
9

 */
package org.example

import scala.language.postfixOps
object Remove_oddposition extends App{

  println("Number of Integers in the List : ")
  val number= scala.io.StdIn.readInt()
  var list :List[Int] = read(number)
  println(s"Result : ${remove(list)}")


  def read(num:Int):List[Int]={
    println("Enter List value : ")
    val array1=new Array[Int](num)
    array1.map(_ => scala.io.StdIn.readInt()).toList
  }
  def remove(list1:List[Int]):List[Int] =
    (list1.indices.collect { case i if i % 2 != 0 => list1(i) }).toList

}
