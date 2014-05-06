object ws {
  	import funsets.FunSets._
  	import funsets.FunSets;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(100); 
  
  
    val s1 = singletonSet(1);System.out.println("""s1  : Int => Boolean = """ + $show(s1 ));$skip(20); val res$0 = 
    contains(s1, 1);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(50); val res$1 = 
    
    forall(x => x % 4 == 0, y => y % 2 == 0);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(51); val res$2 = 
    
    
    exists(x => x % 4 == 0, p => p == 0);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(51); 
    
    
    val sEven = { x: Int => x % 2 == 0 };System.out.println("""sEven  : Int => Boolean = """ + $show(sEven ));$skip(36); val res$3 = 
    
    FunSets.contains(sEven, 2);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(52); 
    
    val sTest = { x: Int => x == 4 || x == 2 };System.out.println("""sTest  : Int => Boolean = """ + $show(sTest ));$skip(35); 
    val sT2 = { x: Int => x == 4 };System.out.println("""sT2  : Int => Boolean = """ + $show(sT2 ));$skip(36); val res$4 = 
    
    FunSets.exists(sTest, sT2);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(68); 
    
    val fil = FunSets.filter(x => x % 2 == 0, x => x % 2 == 1);System.out.println("""fil  : Int => Boolean = """ + $show(fil ));$skip(26); val res$5 = 
    FunSets.toString(fil);System.out.println("""res5: String = """ + $show(res$5));$skip(79); 


    val a = FunSets.map(x => Array(1,3,4,5,7,1000).contains(x) , x => x * 2);System.out.println("""a  : Int => Boolean = """ + $show(a ));$skip(31); val res$6 = 
      
    FunSets.toString(a);System.out.println("""res6: String = """ + $show(res$6))}
}
