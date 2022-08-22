fun findmaxnum(arr:Array<Int>) {
    var max = arr[0]
    var count = 0
    for (i in arr) {
        println("a[$count] = $i")
        if (i > max) {
            max = i
        }
        count++
    }
    println(max)
}
fun main()
{
    var arr = arrayOf(47, 81, 20, 13, 55, 14)
    findmaxnum(arr)

}