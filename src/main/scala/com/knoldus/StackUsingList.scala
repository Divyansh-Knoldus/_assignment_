package com.knoldus
class StackUsingList{
  var list: List[Any] = List.empty
  var top: Int = -1
  def push(element:Any):Unit = {
    top = top + 1
    list = list ::: List(element)
  }
  def pop(): Unit = {
    if (top == -1){
      println("Stack is Underflow")
    }
    else {
      list = list.dropRight(1)
      top = top - 1
    }
  }
  def isEmpty:Boolean = {
    if (top == -1) true
    else false
  }
  def size:Int = list.length
  def peek: Any = {
    if (top >= 0) list(top)
    else println("Stack is Underflow. Therefore, no peek element exist.")
  }

}
object StackUsingListTest
{
  def main(args: Array[String]): Unit = {
    val stack = new StackUsingList()
    stack.push(10)
    stack.push(12)
    stack.push(13)
    stack.push(44)
    stack.pop()
    println("Position of top most element in the stack is "+stack.top)
    println(stack.isEmpty) // print true if the stack is empty. Otherwise, false
    println("The size of the stack is "+stack.size)
    println("The peek element of the stack is "+stack.peek)
  }
}