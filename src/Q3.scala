

object Q3 {
  def main(Args:Array[String]){
  
 println("Enter positive integer") 
 var a= scala.io.StdIn.readInt()
    
    addAll(a)//display 15(1+2+3+4+5)
  
  def addAll(x:Int,i:Int=1,sum:Int=0):Any ={
    if(x<1){
      println("Please enter positive integer")
    }
    else if(i<=x){
      return addAll(x,i+1,sum+i)
    }
    else{
      println("Addition of numbers from1 to "+ x +"=" +sum)
    }
  }
  
}
}