/**
 * Created by Reptilko on 12/13/2017.
 */
fun main(args: Array<String>) {
    println("Enter x:")
    var x:Int= readLine()?.toInt() ?:1
    when(x){
        0 -> println("X is 0.")
        10 -> println("EKS ES CEN")
        42 -> println("Answer!")
    else -> println("x is not 0 or 10 or 42, it is $x.")
    }
}