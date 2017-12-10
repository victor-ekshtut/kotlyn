fun main(args: Array<String>) {
    print("Enter your age:")
    var Age =readLine()?.toInt() ?:1
    if(Age>=5){
        println("You are 5 or older.")
    }
    println("You are $Age years old.")
}