package org.example

object Programe0412 {

}


trait Person0412{
  def getname:String
  def getage:Int
  def getaddress:Address0412
}

case class Address0412(
                  var city:String="Dali",
                  var country:String="China"
                  )

