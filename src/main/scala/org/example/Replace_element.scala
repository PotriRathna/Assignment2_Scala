package org.example

/*
Replace every element with the next greatest element (from right side) in a given array of integers.
There is no element next to the last element, therefore replace it with -1
Test Cases
Input  Array [9, 5, 8, 4, -10, 21, 6, 17, 11]
Output  Array [21, 21, 21, 21, 21, 21, 17, 17, -1]
 */

object Replace_element extends App{

  println("Number of Integers in the Array : ")
  val number= scala.io.StdIn.readInt()
  val arr = read(number)
  arr(number-1)= -1
  val result = replace(arr,number-1)
  println("The modified array:")
  result.foreach(println)

  def read(num:Int):Array[Int]={
    println("Enter List value : ")
    val array1=new Array[Int](num)
    array1.map(_ => scala.io.StdIn.readInt())
  }
  def replace(array1:Array[Int],x : Int):Array[Int] ={
    var initial:Int=array1(x)
    if(x-1 >=0)
      {
        if(initial<array1(x-1)) initial=array1(x-1)
        else array1(x-1)=initial
        replace(array1,x-1)
      }
    array1
  }
}
