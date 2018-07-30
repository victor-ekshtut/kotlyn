/**
 * Created by Reptilko on 1/9/2018.
 */
fun main(args: Array<String>) {
    var map=HashMap<Int, String>()
    map.put(1,"panda")
    map.put(2,"reptil")
    map.put(3,"ante")
    println(map.get(3))

    for(k in map.keys){
        println(map.get(k))
    }
}