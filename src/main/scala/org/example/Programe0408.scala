package org.example
import scala.io.Source


class Foo{

  var text={
    var lines=""
    try{
      lines=Source.fromFile("D:\\IDEACode\\Learning\\src\\main\\scala\\org\\example\\Model0401.scaa").getLines().mkString
    }catch{
     case e:Exception=>lines="Error"
    }
    lines
  }

  println(text)


  def loadFile:String=Source.fromFile("D:\\IDEACode\\Learning\\src\\main\\scala\\org\\example\\Model0401.scaa").getLines().mkString


}






object Programe0408 extends App{


  val f=new Foo

}
