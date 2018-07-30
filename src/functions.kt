/**
 * Created by Reptilko on 1/13/2018.
 */

fun Addition(n1:Int, n2:Int):Int{
    var addition=n1+n2
    return addition
    //or just return n1+n2
}

fun Subtraction(n1:Int, n2:Int):Int{
    var substraction=n1-n2
    return substraction
}

fun Multiplication(n1:Int, n2:Int):Int{
    var multiplication=n1*n2
    return multiplication
}

fun Division(n1:Int, n2:Int):Int{
    var division=n1/n2
    return division
}

//no return in this function(void); Unit; can go without :Unit?
fun Display(n:Int=1){
    println("Number: $n")
}

fun HelloWorld(){
    println("Hello World")
}
fun main(args: Array<String>) {

    println("Addition: ${Addition(1,2)}")

    println("Multiplication: ${Multiplication(1,2)}")

    println("Subtraction: ${Subtraction(1,2)}" )

    println("Division: ${Division(1,2)}")

    Display()

    Display(2)

    HelloWorld()
}