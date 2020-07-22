package part_10

import java.util.*

fun main() {
    var users = listOf<String>(
            "Behrooz",
            "sajad",
            "Elahe",
            "Mehdi",
            "Emad"
    )

    for (name in users) {
        println(name)
    }

    println()

    for ((index, name) in users.withIndex()) {

        println("at index $index name is $name")

    }

    println()

    var car = TreeMap<String,String>()
    car["name"] = "pride"
    car["model"] = "2020"
    car["company"] = "saipa"
    car["coast"]   = "85,000,000"

    for ((key,value) in car){
        println("$key -> $value")
    }

}