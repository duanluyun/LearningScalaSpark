package org.example

object Model0403_2 {


  def main(args: Array[String]): Unit = {


    val duanluyun=Person04032("duanluyun",28,140)


    println(duanluyun)


    print(duanluyun.weight)


    val unknow=Person04032(29)

    println(unknow)
  }

}



case class Person04032(var name:String,var age:Int,weight:Int)


object Person04032{

  def apply(age:Int): Person04032 ={
    new Person04032("unknow",age,140)
  }


  def apply(name:String): Person04032 ={

    new Person04032(name,0,140)
  }


}