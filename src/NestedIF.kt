/**
 * Created by Reptilko on 12/13/2017.
 */
fun main(args: Array<String>) {
    println("Enter your ID numeration")
    var ID= readLine().toString()
    var pandaID="87654321"
    if(ID!!.length==8){
        println("Thank you!")
        if(ID==pandaID){
            println("Welcome to PandaLand.")
        }
    }
    else{
        println("Enter again..")
    }
    println("Your ID is $ID")
}