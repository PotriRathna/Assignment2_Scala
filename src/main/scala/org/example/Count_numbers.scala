package org.example

/*
Count the number of elements in an array without using count, size or length operators (or their equivalents).
 Test Cases :
 Sample Input= List[2, 3, 1, 7, 9, 5, 11, 3, 5,3]
Sample Output: 10
 */

object Count_numbers extends App {

  val list: List[Int] = List(2, 5, 1, 4, 3, 7, 8, 6, 0, 9, 12, -4, -6)
   countnumber(list,0)
  def countnumber(list1: List[Int],i: Int) :Int =
    {
      val count = list1.foldLeft(0){(accumulator,list1)=> accumulator+1}
      println(s"Number of Elements in the List : $count")
      i
    }

}
