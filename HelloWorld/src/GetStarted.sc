object GetStarted {
  println("Hello Scala")                          //> Hello Scala
  val dist:Double = 22 // immutable               //> dist  : Double = 22.0
  println(dist)                                   //> 22.0
  val myarr:Array[String]=new Array(6)            //> myarr  : Array[String] = Array(null, null, null, null, null, null)
	myarr(0)  = "one"
	// val - immutable
	// var - mutable
	var x:Int = 5                             //> x  : Int = 5
	println(x)                                //> 5
	x = 9
	println(x)                                //> 9
	val myList = List(1,2,3,4)                //> myList  : List[Int] = List(1, 2, 3, 4)
	val mySum = myList.reduce((a,y)=> a+y)    //> mySum  : Int = 10
	print(mySum)                              //> 10
	
	def afunction(x:String, y:String):String = {
		return  (x+y)
	}                                         //> afunction: (x: String, y: String)String
	afunction("Hello", " Scala")              //> res0: String = Hello Scala
}