fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()

    var z=addnums(a,b,c)
    println("Your Entered Numbers Sum is: $z")
}
fun addnums(vararg numArray:Int):Int {
    var sum = 0
    for(i in numArray) sum += i
    return sum
}