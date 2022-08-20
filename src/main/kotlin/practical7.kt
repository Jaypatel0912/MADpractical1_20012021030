fun main(){
    println("Enter number For Find Factorial Number :")
    var n1:Int= readLine()!!.toInt();
    var n2:Double = fact(n1);
    var n3:Double = fact1(n1,1);
    println("-----------Using Recursion-----------")
    println("Factorial Number of ${n1} is : ${n2} ");
    println("--------Using TailRec Keyword--------");
    println("Factorial Number of ${n1} is : ${n3} ");
}
fun fact(n:Int):Double{
    if(n==1){
        return n.toDouble();
    }
    else{
        return n*fact(n-1);
    }
}
tailrec fun fact1(n:Int,a:Int):Double{
    var y:Int;
    if(n==1){
        return a.toDouble() ;
    }
    else{
        return fact1(n-1,a*n);
    }

}