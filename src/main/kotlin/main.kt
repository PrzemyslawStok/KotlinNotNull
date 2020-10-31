fun main() {
    var str:String? = "Przemysław"

    println("Długość napisu: ${str?.length}")
    println("Długość napisu: ${str!!.length}")

    if(true)
        str = null

    println("Długość napisu: ${str?.length}")
    println("Długość napisu: ${str!!.length}")

}
