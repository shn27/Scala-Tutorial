package Class.abstractClass

abstract class Bike(a:Int){             // Creating constructor
  var b:Int = 20                      // Creating variables
  var c:Int = 25
  def run()                           // Abstract method
  def performance(){                  // Non-abstract method
    println("Performance awesome")
  }
}

class Hero(a:Int) extends Bike(a){
  c = 30
  def run(){
    println("Running fine...")
    println("a = "+a)
    println("b = "+b)
    println("c = "+c)
  }
}

object MainObject{
  def main(args: Array[String]){
    var h = new Hero(10)
    h.run()
    h.performance()
  }
}