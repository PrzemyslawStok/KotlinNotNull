import java.lang.NullPointerException
import java.lang.NumberFormatException

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



}
