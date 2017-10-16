package org.jetbrains.kotlinworkshop.introduction._4Hierarchies


abstract class StoredEntity {
    val isActive = true

    abstract fun store()

    fun status(): String {
        return isActive.toString()
    }
}

class Employee : StoredEntity() {
    override fun store() {
        throw UnsupportedOperationException("not implemented")
    }
}


fun main(args: Array<String>) {
    val se = Employee()
    se.isActive
    se.status()
}