/**
 * Created by Reptilko on 1/9/2018.
 */
fun main(args: Array<String>) {
    var map=hashMapOf(1 to "panda", 2 to "reptil")
    map.put(3,"ante")
    println(map.get(3))
    println(map[3]) // same as map.get(x); x=3

    var ottff= arrayOf(1,2,3,4,5)
    println(ottff[0])

    var otfs = listOf(1,2,4,6)
    for (item in otfs){
        println(item)
    }

    var mList= mutableListOf(10,12,14,16)
    mList[0]=9
    for(item in mList){
        println(item)
    }
}