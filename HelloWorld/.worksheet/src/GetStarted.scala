object GetStarted {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(44); 
  println("Hello Scala");$skip(36); 
  val dist:Double = 22;System.out.println("""dist  : Double = """ + $show(dist ));$skip(16);  // immutable
  println(dist);$skip(39); 
  val myarr:Array[String]=new Array(6);System.out.println("""myarr  : Array[String] = """ + $show(myarr ));$skip(19); 
	myarr(0)  = "one";$skip(53); 
	// val - immutable
	// var - mutable
	var x:Int = 5;System.out.println("""x  : Int = """ + $show(x ));$skip(12); 
	println(x);$skip(7); 
	x = 9;$skip(12); 
	println(x);$skip(28); 
	val myList = List(1,2,3,4);System.out.println("""myList  : List[Int] = """ + $show(myList ));$skip(40); 
	val mySum = myList.reduce((a,y)=> a+y);System.out.println("""mySum  : Int = """ + $show(mySum ));$skip(14); 
	print(mySum);$skip(67); 
	
	def afunction(x:String, y:String):String = {
		return  (x+y)
	};System.out.println("""afunction: (x: String, y: String)String""");$skip(30); val res$0 = 
	afunction("Hello", " Scala");System.out.println("""res0: String = """ + $show(res$0))}
}
