/**
 * Created by Reptilko on 1/13/2018.
 */

fun AdditionX(n1:Int, n2:Int):Int{
    var addition=n1+n2
    return addition
}
fun AdditionX(n1:Int, n2:Int, n3:Int):Int{
    var addition=n1+n2+n3
    return addition
}
fun AdditionX(n1:Int, n2:Int, n3:Int, n4:Int):Int{
    var addition=n1+n2+n3+n4
    return addition
}


fun main(args: Array<String>) {

    var additionNumber=AdditionX(10,11)
    println("Addition=" + additionNumber)

    additionNumber=AdditionX(10,11,12)
    println("Addition=" + additionNumber)

    additionNumber=AdditionX(10,11,12,13)
    println("Addition=" + additionNumber)

}
fun sumInts(ints : Array<Int>):Int{
    return ints.fold(0, {old, new -> old+new})
}