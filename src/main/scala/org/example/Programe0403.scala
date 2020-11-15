package org.example

object Model0403 {

  def main(args: Array[String]): Unit = {


    val p=new Person0403("duanluyun")
    val p2=new Person0403(24)
    val p3=new Person0403

  }

}


class Person0403( var name:String,var age:Int){

  def this(age:Int){
    this(Params.name,age)
  }


  def this(name:String){
    this(Params.age)
    this.name=name
  }


  def this(){
    this(Params.name,Params.age)
  }




  override def toString=s"the person's name is $name and age is $age"


  println(this)
}


object Params{

  val name:String="duanluyun"

  val age:Int=24

}