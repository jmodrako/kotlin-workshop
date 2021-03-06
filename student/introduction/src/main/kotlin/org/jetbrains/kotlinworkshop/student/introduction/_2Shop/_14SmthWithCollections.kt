package org.jetbrains.kotlinworkshop.student.introduction._2Shop

// Rewrite JavaCode.doSomethingStrangeWithCollection function to Kotlin.
fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy { it.length }

    return groupsByLength.values.maxBy { group -> group.size }
}

