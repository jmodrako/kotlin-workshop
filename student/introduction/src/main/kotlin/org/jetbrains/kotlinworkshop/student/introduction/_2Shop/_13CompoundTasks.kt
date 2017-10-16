package org.jetbrains.kotlinworkshop.student.introduction._2Shop

// Return the set of customers who ordered the specified product
fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    return this.customers.filter { it.orderedProducts.contains(product) }.toSet()
}

// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return this.orders
            .filter { it.isDelivered }
            .flatMap { it.products }
            .sortedBy { it.price }
            .firstOrNull()
}

// Return the number of times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return this.customers
            .flatMap { it.orders.flatMap { it.products } }
            .groupBy { it }
            .map { it.key to it.value.size }
            .sortedBy { it.second }
            .first { it.first == product }.second

}
