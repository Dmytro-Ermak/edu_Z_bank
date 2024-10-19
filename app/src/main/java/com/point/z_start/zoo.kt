package com.point.z_start

class ZooShop {
    fun determineAnimal(breed: String, weight: Double, age: Int): Animal? {
        return when (breed.lowercase()) {
            "husky" -> Husky(weight, age)
            "corgi" -> Corgi(weight, age)
            "scottish" -> ScottishCat(weight, age)
            "siamese" -> SiameseCat(weight, age)
            else -> null
        }
    }
}