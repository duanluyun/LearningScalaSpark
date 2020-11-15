package org.example

class Animal(var name:String,var age:Int){

  override def toString=s"the animal name is ${name} \n and  the age of the age is ${age}"

  def this(name:String){
    this(name,25)
  }

}

class Pig(name:String)extends Animal(name){



}


object Programe0411 extends App {


  val p=new Pig("chengwenqi")

  println(p)


}
