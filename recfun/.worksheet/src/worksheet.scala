object worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(164); 
  
	def product(f: Int => Int)(a: Int, b: Int): Int = {
		def loop(a:Int, acc: Int): Int = {
			if(a >= b) acc
			else loop(a+1, f(a) * acc)
		}
		
		loop(a, 1)
	};System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(25); val res$0 = 
	
	product(x => x)(2, 4);System.out.println("""res0: Int = """ + $show(res$0))}
  
}
