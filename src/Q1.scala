

object Q1 {
  def main(Args:Array[String]){
     print("Enter number :")
    val a=scala.io.StdIn.readInt()
    println(a+" - "+prime(a))
    
    
    
  }
  //Function to return true for a prime number and false for the other
  def prime(a:Int,b:Int = 2): Boolean= {
    if(a==b){
      return true
    }
    else if(a<2 || a%b==0){
      return false
    }
    else
      return prime(a,b+1)
  }
}