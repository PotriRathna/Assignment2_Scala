/*
Find maximum product of two integers in a given array of integers.
Sample Input= Array [2, 3, 1, 7, 9, 5, 11, 3, 5]
Sample Output: 99
 */
package org.example

import scala.annotation.tailrec

object Max_Product extends App{

  println("Number of Integers in the Array : ")
  val number = scala.io.StdIn.readInt()
  val arr = new Array[Int](number)
  println("Enter the value : ")
  print("maximum product :" + product(arr.map(_ => scala.io.StdIn.readInt()), 0,1,0))
  @tailrec
  def product(array1: Array[Int], i: Int,j:Int, maxi:Int): Int = {

    var maximum:Int=maxi
    if(i<number-1){
      if((j<= number-1)&&(j!=i)){
      maximum = scala.math.max(maxi, array1(i) * array1(j))
      product(array1,i,j+1,maximum) }
      else
        product(array1,i+1,1,maximum)
    }
    else
      maximum
  }

}
