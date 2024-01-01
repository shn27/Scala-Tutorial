package Class.methodOverriding

class Vehicle {
  val speed:Int = 60
  def run(){
    println("vehicle is running")
  }
}
class Bike extends Vehicle{
  override val speed:Int = 100     // Override keyword
  override def run(){
    println("Bike is running")
  }
}

object MainObject{
  def main(args:Array[String]){
    var b = new Bike()
    b.run()
    println(b.speed)
  }
}