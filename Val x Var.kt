/**
 * Created by Reptilko on 12/15/2017.
 */
fun main(args: Array<String>) {
    val x:Double=4.13
    var y:Double=42.42
//    x=x+1 //it won't work
    y=y+1
    println(x)
    println(y)
    var xx:Double?
    xx=x+1
    println(xx)
}
/*
Values(val) are here as values that do not change(immutable)anywhere, anyhow, so
that is the reason i cannot add +1 on it and save it as x again, what I can do
is create new Variable and set its values to x+1.
e.g.
var xx:Double?
xx=x+1
println(xx)
Variables(var) are mutable, and can be assigned gazillion times.
 */