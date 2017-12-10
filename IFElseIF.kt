fun main(args: Array<String>) {
    print("Enter how much MIOTA you have:")
    var MIOTA =readLine()?.toInt() ?:1
    if(MIOTA>=10000){
        println("HODL.You are rich!")
    }
    else if(MIOTA>=5000 && MIOTA<10000){
        println("HODL THAT $MIOTA MIOTAs.")
    }
    else if(MIOTA>=1 && MIOTA<5000){
        println("FEEL FREE TO HODL THAT $MIOTA MIOTAs.")
    }
    else{
        println("BUY MIOTA!!!")
    }
    println("You have $MIOTA MIOTA.")
}