package com.point.z_start

interface Cat : Animal {
    val behaviorType: BehaviorType
}

enum class BehaviorType {
    ACTIVE, PASSIVE
}

class ScottishCat(override val weight: Double, override val age: Int, override val breed: String) : Cat {
    override val behaviorType = BehaviorType.PASSIVE
    override fun who() {
        print("This animal is a cat\n")
    }
}

class SiameseCat(override val weight: Double, override val age: Int, override val breed: String) : Cat {
    override val behaviorType = BehaviorType.ACTIVE
    override fun who() {
        print("This animal is a cat\n")
    }
}