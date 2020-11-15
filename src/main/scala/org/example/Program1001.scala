package org.example

object Program1001 extends App {

val p1=new Person1001("duanluyun",28)
val p2=new Person1001("chengwengqi",25)



  print(p1.getAge())

}

class Person1001 ( var name:String,private [this] var age:Int){


def getAge():Int={
  return this.age
}

}


