fun main() {
    var jeep = Car("wrangler", " truck ", "black", 6)
    var tata = Bus("Isuzu", "scania", "yellow and black", 60)

    //class car
    jeep.carry(6)
    jeep.identity()
    var fees = jeep.calculateParkingFees(5)
    println(fees)

    //class bus
    tata.carry(60)
    tata.identity()
    var totalFees = jeep.calculateParkingFees(10)
    println(totalFees)

}

//create a class called car
open class Car(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        if (people == capacity) {
            println("Carrying $people passengers")
        } else {
            var x = 2
            println("Over capacity by $x people")
        }
    }

    fun identity() {
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        var parkingFees = hours * 20
        return parkingFees
    }
}

class Bus(make: String, model: String, color: String, capacity: Int) : Car(make, model, color, capacity) {

    override fun calculateParkingFees(hours: Int): Int {
        return super.calculateParkingFees(hours)
        return capacity
    }

    fun maxTripFare(fare: Double): Double {
        var maxFare = fare * capacity
        return maxFare
    }


}
