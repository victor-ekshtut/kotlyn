fun main(args: Array<String>) {
    print("Enter your age:")
    var Age =readLine()?.toInt() ?:1
    if(Age>=18){
        println("You are adult.")
    }
    else{
        println("You are not adult.")
    }
    println("You are $Age years old.")
}