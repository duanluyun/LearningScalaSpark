package org.example

class Person0404 private (var name:String,var age:Int){

  override def toString=s"the person name is $name and age is $age"
}


object Person0404{


  val duanluyun=new Person0404("duanluyun",28)


  def getInstnace():Person0404={
    return duanluyun
  }

}




object Program0404 extends App {

  println(Person0404.getInstnace())

}
