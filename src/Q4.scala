

object Q4 {
  def main(args:Array[String]){
		print("Enter number :")
		val a=scala.io.StdIn.readInt()
		if(iseven(a)){
		  print("Even") 
		}
		else{
		  print("Odd")
		}
		
	}
  def iseven(n:Int):Boolean= n match{
  case x if(x==0)=> true
  case _ => isodd(n-1)
  }
  def isodd(n:Int):Boolean = !(iseven(n))
}