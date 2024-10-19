package com.point.z_start

interface Dog : Animal {
    val biteType: BiteType
}

enum class BiteType {
    STRAIGHT, OVERBITE, UNDERBITE
}

class Husky(override val weight: Double, override val age: Int) : Dog {
    override val biteType = BiteType.STRAIGHT
    override fun who() {
        print("This animal is a dog\n")
    }
}

class Corgi(override val weight: Double, override val age: Int) : Dog {
    override val biteType = BiteType.OVERBITE
    override fun who() {
        print("This animal is a dog\n")
    }
}

