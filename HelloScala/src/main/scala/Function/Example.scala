object Example {
  def main(args: Array[String]) = {
    var result1 = functionExample(a = 15, b = 2)    // Parameters names are passed during call
    var result2 = functionExample(b = 15, a = 2)    // Parameters order have changed during call
    var result3 = functionExample()             // Only values are passed during call
    println(result1+"\n"+result2+"\n"+result3)
  }
  def functionExample(a:Int = 0 , b:Int = 0 ):Int = {
    a+b
  }
}