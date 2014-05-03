package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
  
  	def loop(c: Int, r: Int): Int = {
		if (c < 0 || r < c) 0
  		else if (c == 0 || r == 0) 1
	  	else loop(c-1, r-1) + loop(c, r-1)
  	}
  	
  	loop(c, r)
  }             

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    
    def loop(acc: Int, chars: List[Char]): Int = {
      if (chars.isEmpty) acc
      else if (chars.head == '(') loop(acc + 1, chars.tail)
      else if (chars.head == ')' && acc <= 0) -1
      else if (chars.head == ')' && acc > 0) loop(acc - 1, chars.tail)
      else loop(acc, chars.tail)
    }
    
    loop(0, chars) == 0
  }


  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

	def loop(money: Int, coins: List[Int]): Int = {
	  if (money == 0) 1
	  else if (money < 0) 0
	  else if  (money > 0 && coins.isEmpty ) 0
	  else loop(money - coins.head, coins) + loop(money, coins.tail)
	}
    
    loop(money, coins.sorted)
  }
}
