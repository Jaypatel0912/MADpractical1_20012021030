class Car(type:String, model:String, price:Int, owner:String, miles:Int){

    var ty:String = type
    var mo =model
    var p:Int = price
    var ow = owner
    var m:Int = miles
    fun getCarInformation() {
        println("Selling Price of Car: " + (p - m).toString() + "rs")
        println("Actual price: " + p.toString() + "rs")
        println("Total Kms: " + m.toString())
        println("car model:" + mo.toString())
        println("car owner: " + ow.toString())
        println("car miles: " + m.toString())
        println()

    }
    fun getOriginalCarPrice() {
        println("Actual price: " + p.toString() + "rs")
        println()

    }
}
fun main() {
    var c1 = Car("TATA", "Nexon", 125000, "Ratan Tata", 10000)
    c1.getCarInformation()
    var c2 = Car(" SUV", "Baleno", 100000, "Hitesh", 50000)
    c2.getCarInformation()
    println("========================================")
    c1.getOriginalCarPrice()
    c2.getOriginalCarPrice()
}