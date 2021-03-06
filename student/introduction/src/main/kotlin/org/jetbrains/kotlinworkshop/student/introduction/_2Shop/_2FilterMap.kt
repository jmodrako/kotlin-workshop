package org.jetbrains.kotlinworkshop.student.introduction._2Shop

fun main(args: Array<String>) {
    val list = listOf(-1, 3, 0, -5, 7)

    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }
    println(positiveNumbers)  // [3, 7]

    val squares = list.map { it * it }
    println(squares)  // [1, 9, 0, 25, 49]
}

// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    return customers.map { it.city }.toSet()
}

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City): List<Customer> {
    return customers.filter { it.city == city }
}


