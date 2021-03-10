package com.knoldus
class queue_using_list {
  var list: List[Any] = List()
  var front: Int = -1
  var rear: Int = -1
  def enqueue(element:Any): Unit = {
    if (front== -1 && rear == -1) {
      front = front + 1
      rear = rear + 1
      list = list ::: List(element)
    }
    else{
      rear = rear + 1
      list = list ::: List(element)
    }
  }
  def dequeue(): Unit = {
    if (front== -1 && rear == -1){
      println("Queue is empty")
    }
    else if(front == rear){
      list = list.drop(1)
      front = -1
      rear = -1
    }
    else{
      list = list.drop(1)
      front = front + 1
    }
  }
  def isEmpty:Boolean ={
    if(front == -1 || rear == -1) true
    else false
  }
}
object queue_using_listTest{
  def main(args: Array[String]): Unit = {
    val queue = new queue_using_list()
    queue.enqueue(10)
    queue.enqueue(15)
    queue.enqueue(3)
    queue.enqueue(6)
    queue.dequeue()
    queue.dequeue()
    queue.enqueue(22)
    println("Position of the element to be deleted is "+queue.front)
    println("Position of the newly inserted element is "+queue.rear)
    print(queue.isEmpty)
  }
}