package org.jetbrains.kotlinworkshop.student.introduction._2Shop

fun main(args: Array<String>) {
    val numbers = listOf(1, 3, -4, 2, -11)

    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    return this.customers.filter {
        val (d, u) = it.orders.partition { it.isDelivered }
        return@filter d.size < u.size
    }.toSet()
}
