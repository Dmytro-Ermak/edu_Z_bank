package com.point.z_start

fun main() {
    val zooShop = ZooShop()

    val dog = zooShop.determineAnimal("Husky", 30.0, 5)
    dog?.who()

    val cat = zooShop.determineAnimal("Siamese", 4.5, 3)
    cat?.who()
}
