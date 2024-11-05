package com.point.z_start

interface Animal {
    val weight: Double
    val age: Int
    val breed: String
    fun who() {
        print("This animal is an animal")
    }
}