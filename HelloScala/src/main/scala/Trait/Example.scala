package Trait

trait Printable{
  def print()
}

trait Showable{
  def show()
}

class A6 extends Printable with Showable{
  def print(){
    println("This is printable")
  }
  def show(){
    println("This is showable");
  }
}

object MainObject{
  def main(args:Array[String]){
    var a = new A6()
    a.print()
    a.show()
  }
}
