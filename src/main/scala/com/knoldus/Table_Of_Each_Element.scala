package com.knoldus
object Table_Of_Each_Element{
  def print_Table(element:Int):Unit={
    print("Table of "+element+" => ")
    for(count<-1 to 10) {
      {
        print(element * count+" ")
      }
    }
  }
  def main(args: Array[String]): Unit = {
    val given_List= List(2,5,8,7,3,9,8,14,17,20)
    for (element <- given_List)
    {
      print_Table(element)
      println("\n")
    }
  }
}