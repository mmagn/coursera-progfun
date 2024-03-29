object worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
	def product(f: Int => Int)(a: Int, b: Int): Int = {
		def loop(a:Int, acc: Int): Int = {
			if(a >= b) acc
			else loop(a+1, f(a) * acc)
		}
		
		loop(a, 1)
	}                                         //> product: (f: Int => Int)(a: Int, b: Int)Int
	
	product(x => x)(2, 4)                     //> res0: Int = 6
  
}