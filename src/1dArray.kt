/**
 * Created by Reptilko on 1/9/2018.
 */
fun main(args: Array<String>) {
    var arrayInt = arrayOf<Int>(1,2,3,4,5)
    arrayInt[3]= 10
    println(arrayInt[3])
    for(element in arrayInt){
        println(element)
    }

    println("\n")

    //string array

    var arrayStr = arrayOf<String>("Panda", "Leptir", "Reptil")
    for(index in arrayStr){
        println("ArrayStr[$index]=$index ")

    }
    // or
    for(index in arrayStr){
        println("ArrayStr[$index]=" + index)
    }

    println("\n")

    //array list

    var arrayList= ArrayList<String>()
    arrayList.add("P")
    arrayList.add("a")
    arrayList.add("n")
    arrayList.add("d")
    arrayList.add("a")

    println("First: " + arrayList.get(0))
    println("Second: " + arrayList.get(1))
    println("Third: " + arrayList.get(2))
    println("Fourth: " + arrayList.get(3))
    println("Fifth: " + arrayList.get(4))

    println("\n")

    println("Panda?")
    for(item in arrayList){
        print(item)
    }

    println("\n")

    println("Elements by index:")
    for(index in 0..arrayList.size-1){
        println("$index:"+arrayList.get(index))
    }

    println("\n")

    arrayList.set(0, "Z")
    println("First: " + arrayList.get(0))
    println(arrayList)
    for(item in arrayList){
        print(item)
    }

    println("\n")
    //search

    if(arrayList.contains("a")){
        println("Letter a is found!")
    }
    else{
        println("There is no letter a!")
    }

}