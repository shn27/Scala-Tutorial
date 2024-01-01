package Class

class Student(id:Int, name:String){
  var age:Int = 0
  def getRecord(){
    println(id+" "+name+" " + age );
  }
  def this(id:Int, name:String,age:Int){
    this(id,name)       // Calling primary constructor, and it is first line
    this.age = age
  }
}

object MainObject{
  def main(args: Array[String]){
    var student1 = new Student(101,"Raju",10);
    var student2 = new Student(102,"Martin");
    student1.getRecord();
    student2.getRecord();
  }
}