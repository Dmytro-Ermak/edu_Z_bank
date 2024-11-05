package com.point.z_start

fun main() {
    val zooShop = ZooShop()

    val dog = zooShop.determineAnimal("Husky", 30.0, 5)
    println(zooShop.who(dog))

    val cat = zooShop.determineAnimal("Siamese", 4.5, 3)
    println(zooShop.who(cat))
}
