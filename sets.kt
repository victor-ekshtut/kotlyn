/**
 * Created by Reptilko on 1/13/2018.
 */
fun main(args: Array<String>) {
    //immutable set
    print("Immutable set: ")
    var setElement = setOf(1,2,3,4,5)
    for (element in setElement){
        print(element)
    }
    //mutable set
    print("\nMutable set: ")
    var setElement0 = mutableSetOf(1,2,3,4,5)
    setElement0.add(6)
    for (element in setElement0){
        print(element)
    }


}