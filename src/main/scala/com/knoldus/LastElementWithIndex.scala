package com.knoldus
object LastElementWithIndex {
  def find_Last_Element_With_Index(input_List: List[Int]): List[Int] = {
    val last_Element_Index = input_List.length - 1
    val last_Element = input_List(last_Element_Index)
    List(last_Element, last_Element_Index)
  }
  def main(args: Array[String]): Unit = {
    val given_List = List(2, 5, 8, 7, 3, 9, 8, 14, 17, 20)
    val List(last_Element, lastElementIndex) = find_Last_Element_With_Index(given_List)
    println("Last Element:" + last_Element + "\nIndex of Last Element:" + lastElementIndex + "\n")
  }
}
