fun main(){
    LocalBazarSection()
    SchoolCourseEnrollment()
    HotelRoomAvailability()
}

fun LocalBazarSection(){
    val fish: Boolean = false
    val vegetable: Boolean = false
    val fruits: Boolean = false
    val meat: Boolean = false
    val bakery: Boolean = false

    // Fish items
    val hasTunaFish: Boolean = false
    val hasSalmonFish: Boolean = true
    val hasMackerelFish: Boolean = false

    // Vegetable items
    val hasCarrot: Boolean = false
    val hasBroccoli: Boolean = true
    val hasTomato: Boolean = false

    // Fruit items
    val hasApple: Boolean = true
    val hasBanana: Boolean = false
    val hasOrange: Boolean = false

    // Meat items
    val hasBeef: Boolean = false
    val hasLamb: Boolean = false
    val hasChicken: Boolean = true

    // Bakery items
    val hasWhiteBread: Boolean = false
    val hasButterBuns: Boolean = false
    val hasCreamBuns: Boolean = true


    if (fish) {
        if (hasTunaFish) {
            println("Tuna fish")
        } else if (hasSalmonFish) {
            println("Salmon fish")
        } else if (hasMackerelFish) {
            println("Mackerel fish")
        } else {
            println("No fish available")
        }
    } else if (vegetable) {
        if (hasCarrot) {
            println("Carrot")
        } else if (hasBroccoli) {
            println("Broccoli")
        } else if (hasTomato) {
            println("Tomato")
        } else {
            println("No vegetables available")
        }
    } else if (fruits) {
        if (hasApple) {
            println("Apple")
        } else if (hasBanana) {
            println("Banana")
        } else if (hasOrange) {
            println("Orange")
        } else {
            println("No fruits available")
        }
    } else if (meat) {
        if (hasBeef) {
            println("Beef")
        } else if (hasLamb) {
            println("Lamb")
        } else if (hasChicken) {
            println("Chicken")
        } else {
            println("No meat available")
        }
    } else if (bakery) {
        if (hasWhiteBread) {
            println("White Bread")
        } else if (hasButterBuns) {
            println("Butter Buns")
        } else if (hasCreamBuns) {
            println("Cream Buns")
        } else {
            println("No bakery items available")
        }
    } else {
        println("No sections are currently available.")
    }
}



fun SchoolCourseEnrollment() {
    val math: Boolean = false
    val science: Boolean = false
    val history: Boolean = false
    val art: Boolean = false
    val computerScience: Boolean = false

    // Preferred schedules for Math
    val mathMorning: Boolean = false
    val mathAfternoon: Boolean = false
    val mathEvening: Boolean = false

    // Preferred schedules for Science
    val scienceMorning: Boolean = true
    val scienceAfternoon: Boolean = false
    val scienceEvening: Boolean = false

    // Preferred schedules for History
    val historyMorning: Boolean = false
    val historyAfternoon: Boolean = false
    val historyEvening: Boolean = false

    // Preferred schedules for Art
    val artMorning: Boolean = false
    val artAfternoon: Boolean = false
    val artEvening: Boolean = false

    // Preferred schedules for Computer Science
    val csMorning: Boolean = false
    val csAfternoon: Boolean = false
    val csEvening: Boolean = false


    if (math) {
        println("Course Math is open for enrollment.")
        if (mathMorning) {
            println("Preferred schedule: Morning")
        } else if (mathAfternoon) {
            println("Preferred schedule: Afternoon")
        } else if (mathEvening) {
            println("Preferred schedule: Evening")
        } else {
            println("No schedule selected for Math")
        }
    } else if (science) {
        println("Course Science is open for enrollment.")
        if (scienceMorning) {
            println("Preferred schedule: Morning")
        } else if (scienceAfternoon) {
            println("Preferred schedule: Afternoon")
        } else if (scienceEvening) {
            println("Preferred schedule: Evening")
        } else {
            println("No schedule selected for Science")
        }
    } else if (history) {
        println("Course History is open for enrollment.")
        if (historyMorning) {
            println("Preferred schedule: Morning")
        } else if (historyAfternoon) {
            println("Preferred schedule: Afternoon")
        } else if (historyEvening) {
            println("Preferred schedule: Evening")
        } else {
            println("No schedule selected for History")
        }
    } else if (art) {
        println("Course Art is open for enrollment.")
        if (artMorning) {
            println("Preferred schedule: Morning")
        } else if (artAfternoon) {
            println("Preferred schedule: Afternoon")
        } else if (artEvening) {
            println("Preferred schedule: Evening")
        } else {
            println("No schedule selected for Art")
        }
    } else if (computerScience) {
        println("Course ComputerScience is open for enrollment.")
        if (csMorning) {
            println("Preferred schedule: Morning")
        } else if (csAfternoon) {
            println("Preferred schedule: Afternoon")
        } else if (csEvening) {
            println("Preferred schedule: Evening")
        } else {
            println("No schedule selected for ComputerScience")
        }
    } else {
        println("No courses are open for enrollment.")
    }
}



fun HotelRoomAvailability() {
    val single: Boolean = false
    val double: Boolean = false
    val suite: Boolean = false
    val deluxe: Boolean = false
    val penthouse: Boolean = false

    // Views for Single room
    val singleSeaView: Boolean = false
    val singleCityView: Boolean = false
    val singleGardenView: Boolean = false

    // Views for Double room
    val doubleSeaView: Boolean = false
    val doubleCityView: Boolean = false
    val doubleGardenView: Boolean = false

    // Views for Suite room
    val suiteSeaView: Boolean = true
    val suiteCityView: Boolean = false
    val suiteGardenView: Boolean = false

    // Views for Deluxe room
    val deluxeSeaView: Boolean = false
    val deluxeCityView: Boolean = false
    val deluxeGardenView: Boolean = false

    // Views for Penthouse room
    val penthouseSeaView: Boolean = false
    val penthouseCityView: Boolean = false
    val penthouseGardenView: Boolean = false

    if (single) {
        println("Room type Single is available.")
        if (singleSeaView) {
            println("Selected view: Sea view")
        } else if (singleCityView) {
            println("Selected view: City view")
        } else if (singleGardenView) {
            println("Selected view: Garden view")
        } else {
            println("No view selected for Single room")
        }
    } else if (double) {
        println("Room type Double is available.")
        if (doubleSeaView) {
            println("Selected view: Sea view")
        } else if (doubleCityView) {
            println("Selected view: City view")
        } else if (doubleGardenView) {
            println("Selected view: Garden view")
        } else {
            println("No view selected for Double room")
        }
    } else if (suite) {
        println("Room type Suite is available.")
        if (suiteSeaView) {
            println("Selected view: Sea view")
        } else if (suiteCityView) {
            println("Selected view: City view")
        } else if (suiteGardenView) {
            println("Selected view: Garden view")
        } else {
            println("No view selected for Suite room")
        }
    } else if (deluxe) {
        println("Room type Deluxe is available.")
        if (deluxeSeaView) {
            println("Selected view: Sea view")
        } else if (deluxeCityView) {
            println("Selected view: City view")
        } else if (deluxeGardenView) {
            println("Selected view: Garden view")
        } else {
            println("No view selected for Deluxe room")
        }
    } else if (penthouse) {
        println("Room type Penthouse is available.")
        if (penthouseSeaView) {
            println("Selected view: Sea view")
        } else if (penthouseCityView) {
            println("Selected view: City view")
        } else if (penthouseGardenView) {
            println("Selected view: Garden view")
        } else {
            println("No view selected for Penthouse room")
        }
    } else {
        println("No rooms are currently available.")
    }
}

