class ArrayExample{
  def show(arr:Array[Int]){
    for(a<-arr)                // Traversing array elements
      println(a)
    println("Third Element = "+ arr(2))        // Accessing elements by using index
  }
}

object MainObject{
  def main(args:Array[String]){
    var arr = Array(1,2,3,4,5,6)    // creating single dimensional array
    var a = new ArrayExample()
    a.show(arr)                     // passing array as an argument in the function

  }
}