package com.point.z_start

class ZooShop {
    fun determineAnimal(breed: String, weight: Double, age: Int): Animal? {
        return when (breed.lowercase()) {
            "husky" -> Husky(weight, age, breed)
            "corgi" -> Corgi(weight, age, breed)
            "scottish" -> ScottishCat(weight, age, breed)
            "siamese" -> SiameseCat(weight, age, breed)
            else -> null
        }
    }
    fun who(animal: Animal?): String {
        return when (animal?.breed?.lowercase()) {
            "husky" -> "It's a dog"
            "corgi" -> "It's a dog"
            "scottish" -> "It's a cat"
            "siamese" -> "It's a cat"
            else -> "It's not an animal"
        }
    }
}