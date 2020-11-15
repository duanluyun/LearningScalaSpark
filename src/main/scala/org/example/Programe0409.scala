package org.example



class Person0409(var username:String,var password:String){
var age=0
var firstname=""
var lastname=""
var address=None:Option[Address]
}


case class Address( var City:String,var state:String,var zip:String)




object Programe0409 extends App {
  val p=new Person0409("luyun","Duan")
  p.address=Some(Address("Dali","longquan","B21"))

  p.address.foreach(x=>{

    println(x.City)

  })
}
