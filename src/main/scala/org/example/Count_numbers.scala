package org.example

/*
Count the number of elements in an array without using count, size or length operators (or their equivalents).
 */

object Count_numbers extends App {

  val list: List[Int] = List(2, 5, 1, 4, 3, 7, 8, 6, 0, 9, 12, -4, -6)
   countnumber(list,0)
  def countnumber(list1: List[Int],i: Int) :Int =
    {
      if (list1.apply(i)!=list1.last)
          countnumber(list1,i+1)
      else
        println("Counted Value :" +(i+1))
      i
    }

}
