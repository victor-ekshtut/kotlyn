/**
 * Created by Reptilko on 12/15/2017.
 */
fun main(args: Array<String>) {
    for(x in 1..10){
        println("First loop: $x")
        for(y in x+1..10){
            println("Second loop: $y")
        }
    }
}
/*
When first loop starts, it prints out number 5, then there comes second loop.
Second loop prints out x+1 to 10 and goes back to first loop. First
loop then prints 2, and goes to second loop which prints out x+1 to 10.
That repeats untill first loop comes to 5 and second loop finishes.
 */