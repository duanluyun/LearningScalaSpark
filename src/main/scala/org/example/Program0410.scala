package org.example

case class Address0411(
                  var country:String="China",
                  var city:String="Dali"
                  )


class Person(var name:String,var address:Address0411){

  override def toString=if(address==null){s"${name}"}else{s"${name}@${address}"}
}

class Employee(name:String,address:Address0411,var age:Int) extends Person(name,address){

  override def toString=s"the employee name is ${name} the address is ${address}  the age is ${age}"

}


object Program0411 extends App {


  val e=new Employee("duanluyun",Address0411(country="America",city="New Yourk"),14)

  println(e.name)
  println(e.address.country)
  println(e.address.city)
  println(e.age)



}
