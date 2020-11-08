package org.example
import org.apache.spark.sql.SparkSession

object Model {


  def main(args: Array[String]): Unit = {

    val p=new Person("luyun","duan")

    println(p.age)

    p.firstname="wenqi"
    p.lastname="cheng"
   print(p)

  }
}


class Person( var firstname:String,var lastname:String){


  val age=0

  override def toString=s"the lastname is $lastname,the first name is $firstname,the age is $age"
  private val home:String=System.getProperty("user.dir")


  def printHome{println(home)}


  def printTotalName{println(this)}

  printHome
  printTotalName


}