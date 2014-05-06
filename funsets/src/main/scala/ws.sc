object ws {
  	import funsets.FunSets._
  	import funsets.FunSets
  
  
    val s1 = singletonSet(1)                      //> s1  : Int => Boolean = <function1>
    contains(s1, 1)                               //> res0: Boolean = true
    
    forall(x => x % 4 == 0, y => y % 2 == 0)      //> res1: Boolean = true
    
    
    exists(x => x % 4 == 0, p => p == 0)          //> res2: Boolean = true
    
    
    val sEven = { x: Int => x % 2 == 0 }          //> sEven  : Int => Boolean = <function1>
    
    FunSets.contains(sEven, 2)                    //> res3: Boolean = true
    
    val sTest = { x: Int => x == 4 || x == 2 }    //> sTest  : Int => Boolean = <function1>
    val sT2 = { x: Int => x == 4 }                //> sT2  : Int => Boolean = <function1>
    
    FunSets.exists(sTest, sT2)                    //> res4: Boolean = true
    
    val fil = FunSets.filter(x => x % 2 == 0, x => x % 2 == 1)
                                                  //> fil  : Int => Boolean = <function1>
    FunSets.toString(fil)                         //> res5: String = {}


    val a = FunSets.map(x => Array(1,3,4,5,7,1000).contains(x) , x => x * 2)
                                                  //> a  : Int => Boolean = <function1>
      
    FunSets.toString(a)                           //> res6: String = {2,6,8,10,14}
}