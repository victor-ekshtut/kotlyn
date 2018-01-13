/**
 * Created by Reptilko on 1/9/2018.
 */
fun main(args: Array<String>) {
    var arrayInt = Array<Int>(5){3}
    arrayInt[3]= 10
    println(arrayInt[3])
    for(element in arrayInt){
        println(element)
    }

    //string array

    var arrayStr = Array<String>(4){""}
    for(index in 0..3){
        print("ArrayStr[$index]=")
        arrayStr[index]=readLine()!!
    }
    for(index in 0..3){
        println("ArrayStr[$index]=" + arrayStr[index])
    }

    //array list

    var arrayList= ArrayList<String>()
    arrayList.add("P")
    arrayList.add("a")
    arrayList.add("n")
    arrayList.add("d")
    arrayList.add("a")

    println("First: " + arrayList.get(0))

    println("Panda?")
    for(item in arrayList){
        print(item)
    }

    println("Elements by index:")
    for(index in 0..arrayList.size-1){
        println("$index.element:"+arrayList.get(index))
    }

    arrayList.set(0, "Z")
    println("First: " + arrayList.get(0))

    //search

    if(arrayList.contains("a")){
        println("Letter a is found!")
    }
    else{
        println("There is no letter a!")
    }

}