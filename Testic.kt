/**
 * Created by Reptilko on 10/27/2017.
 */
fun main(args: Array<String>){
    println("Pozdrav!")
    print("Unesi neki broj:")
    var broj = readLine()
    println("Unjeo si broj: $broj")
    println("Panda Bog KOTLINA")
    val a = 3
    val b = 5
    var c = 0
    println(zbrajanje(a,b))
    zbrajanje(a,b)
    println(oduzimanje(a,b))
    println(mnozenje(a,b))
    println(dijeljenje(a,b))
    println("hoće li ove godine promocija")
    println(c == c)
}
fun zbrajanje(a:Int, b:Int):Int {
    println("Zbroj $a i $b je ${a+b}")
    return a + b
}
fun oduzimanje(a:Int, b:Int):Int {
    return a - b
}
fun mnozenje(a:Int, b:Int):Int {
    return a * b
}
fun dijeljenje(a:Int, b:Int):Int {
    return a - b
}