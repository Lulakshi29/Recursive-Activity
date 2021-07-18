

object Q2 {
  
   def main(Args:Array[String]){
    
    print("Enter number :")
    val a=scala.io.StdIn.readInt()
    PrimeSeq(a)//return all prime numbers less than a
    
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
  
 //Function to print all	prime number which less than n 
  
  def PrimeSeq(num:Int,i:Int=2):Any={
    if(num<=2){
      println("There is no prime numbers less than "+ num)
    }
    else if(i!=num){
      if(prime(i)){
        print(i+" ")
      }
      return PrimeSeq(num,i+1)
    }
    else{
      print("are prime numbers less than "+ num)
    }
  }
}
