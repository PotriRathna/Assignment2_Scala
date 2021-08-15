package org.example

import scala.annotation.tailrec

/*Find maximum difference between two elements in a given array of integers
such that smaller element appears before larger element.
  Sample Input= Array [2, 3, 1, 7, 9, 5, 11, 3, 5]
Sample Output: 10
*/

object Max_Difference extends App {

  println("Number of Integers in the Array : ")
  val number= scala.io.StdIn.readInt()
  println("Enter value : ")
    val arr=new Array[Int](number)
  println("maximum difference :" + difference(arr.map(_ => scala.io.StdIn.readInt()), 0,1,0))
@tailrec
  def difference(array1: Array[Int], i: Int,j:Int, diff:Int): Int = {
    var diff1: Int = diff
    if (i < number - 1) {
      if ((j <= number - 1)&&(j!=i)) {
        diff1 = scala.math.max(diff, array1(i) - array1(j))
        difference(array1, i, j + 1, diff1)
      }
      else
        difference(array1, i + 1, 1, diff1)
    }
    else
      diff1
  }
}

