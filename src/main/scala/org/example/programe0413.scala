package org.example

abstract class Animal0413{
  val name:String
  val age:Int

  var city:String="Dali"

  val country:String="China"

  def getName():Unit
  def getAge():Unit
}

class Dog0413(DogName:String,DogAge:Int) extends Animal0413{

  val name=DogName
  val age=DogAge

  city="hangzhou"

  override val country="America"

  def getName():Unit={
    println(DogName)
  }


  def getAge():Unit={
    println(DogAge)
  }


}


object programe0413 extends App{

4
  val dog0413=new Dog0413("xiaohuan",13)


  println(dog0413.country)
}



