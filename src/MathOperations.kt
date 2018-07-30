

/**
 * Created by Reptilko on 11/8/2017.
 */
fun main(args: Array<String>) {
    print("Enter first number:")
    var n1:Float= readLine()?.toFloat() ?: 1f
    print("Enter second number:")
    var n2:Float=readLine()?.toFloat() ?: 1f
    var plus:Float?
    plus=n1+n2
    println("Plus:"+plus)
    var minus:Float?
    minus=n1-n2
    println("Minus:"+minus)
    var multiplication:Float?
    multiplication=n1*n2
    println("Multi:"+multiplication)
    var division:Float?
    division=n1/n2
    println("Division:"+division)
    var mod:Float?
    mod=n1%n2
    println("Mod:"+mod)
    var n11:Int=n1.toInt()
    var n22:Int=n2.toInt()
    println(n11.rangeTo(n22))//nezkojikuracsampokusavao
    n1++
    println("Increment:" +n1)
    n2--
    println("Decrement:" +n2)
}

