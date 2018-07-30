/**
 * Created by Reptilko on 4/3/2018.
 */
fun main(args: Array<String>) {
    print("Enter your level: ")
    var charLevel= readLine()?.toInt()
    var exp:Double?

    when(charLevel){
        in 1..58 -> exp=((charLevel?.toDouble() ?: 1.0) * 5) + 45
        in 58..68 -> exp=((charLevel?.toDouble() ?: 1.0) * 5) + 235
        in 68..80 -> exp=((charLevel?.toDouble() ?: 1.0) * 5) + 580
        in 80..85 -> exp=((charLevel?.toDouble() ?: 1.0) * 5) + 1878
    else -> exp= 10101010.01010101
    }

    println(exp)
}