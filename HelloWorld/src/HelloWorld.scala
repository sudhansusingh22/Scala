

class HelloWorld {
  object HelloScala{
    def main(args: Array[String]): Unit = {
      var i:Int=0;
      println("Hello world "+ i);
      for(i<-0 to 9){
        println(i);
        println("Hello world" +i);
      }
    }
    
  }
}