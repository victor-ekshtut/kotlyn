/**
 * Created by Reptilko on 1/14/2018.
 */

class Car0(){
    var Owner:String?=null
    var Price:Double?= null
    var MilesDrive:Int?=null
    var Model:Int?=null
    var Type:String?=null
    constructor(Type:String, Model:Int, Price:Double,
                MilesDrive:Int, Owner:String) : this() {
        println("Type: $Type")
        println("Model: $Model")
        println("Price: $Price")
        println("Miles: $MilesDrive")
        println("Owner: $Owner")
        this.Owner=Owner
        this.Price=Price
        this.MilesDrive=MilesDrive
        this.Model=Model
        this.Type=Type
    }
    constructor(RandomVar:Int):this(){
        print("New class instance.RandomVar: " + RandomVar)
    }

    fun GetPrice():Double?{
        return this.Price!! - ( this.MilesDrive!!.toDouble()*10)
    }

    fun GetOwner():String?{
        return this.Owner!!
    }


}

fun main(args: Array<String>) {
    var pyroCar = Car0("Lambo",2018,12.50,0,"Pyro")
    var blasterCar = Car0("Lambo", 2018, 12.25,0,"Blaster")
    println("Price: " +pyroCar.GetPrice())
    println("Owner: " +pyroCar.GetOwner())
    println("Price: " +blasterCar.GetPrice())
    println("Owner: " +blasterCar.GetOwner())
    var randVar= Car0(673)

}