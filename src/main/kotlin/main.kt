import java.lang.NullPointerException
import java.util.*

fun main() {
    var str:String? = "Przemysław"

    println("Długość napisu: ${str?.length}")
    println("Długość napisu: ${str!!.length}")

    if(true)
        str = null

    println("Długość napisu: ${str?.length?:-1}")

    try {
        println("Długość napisu: ${str!!.length}")
    }catch (e:NullPointerException){
        println("Przechwycono wyjątek: Null Pointer Exception")
    }

    var length = 0;

    if(str==null){
        length = 0
    }else
        length = -1

    var length1 = str?.length?:-1

    str?.let{
        println(it)
    }

    example1()
    example1a()

    println(getNumber())
}

fun getNumber():Int{
    val scanner = Scanner(System.`in`)
    val no = scanner.nextInt()

    return no
}

fun example1(){
    var name:String? = "Przemysław"

    name?.let{
        println("Wartość wynosi: ${it}")
    }.also{
        println("To cześć pierwszego bloku also")
    }

    if(true)
        name = null
    else
        name = "Przemysław 1"

    name?.let{
        println("Wartość wynosi: ${it}")
    }.also {
        println("To część bloku also")
    }

}

fun example1a(){
    var str1:String? = "Stokłosa"
    println("Długość napisu ${str1?.length}")

    str1?.let {
        println("Długość napisu ${it.length}")
    }

    if(true)
        str1 = null

    try {
        println("Długość napisu ${str1!!.length}")
    }catch(e: NullPointerException){
        println("Napis zawiera null")
    }

    println("Długość napisu ${str1?.length}")

    val tab:Array<Int?> = arrayOf(1,2,3,4,5,null,null)
    val tab1 = tab.filterNotNull()

    println(tab.asList())
    println(tab1)
}
