fun main() {
    // Task 1: Convert group weights from kg to pounds
    println("Convert group weights from kg to pounds: ")
    val kgOne = 60.0
    val kgTwo = 70.0
    val kgThree = 80.0

    val lb1 = kgOne * 2.20462
    val lb2 = kgTwo * 2.20462
    val lb3 = kgThree * 2.20462

    println("$kgOne kg = $lb1 pounds")
    println("$kgTwo kg = $lb2 pounds")
    println("$kgThree kg = $lb3 pounds")
    println()
    println()

    // Task 2: Convert group heights from inches to feet
    println("Convert group heights from inches to feet: ")
    val inch1 = 65.0
    val inch2 = 70.0
    val inch3 = 72.0

    val feet1 = inch1 / 12.0
    val feet2 = inch2 / 12.0
    val feet3 = inch3 / 12.0

    println("$inch1 inches = $feet1 feet")
    println("$inch2 inches = $feet2 feet")
    println("$inch3 inches = $feet3 feet")
    println()

    // Task 3: Calculate breakfast bill and split
    println("Calculate breakfast bill and split: ")
    val eggPrice = 10.0
    val breadPrice = 20.0
    val dalPrice = 30.0
    val totalBill = eggPrice + breadPrice + dalPrice
    val perPersonBill = totalBill / 2
    println("Total breakfast bill: $totalBill, Per person: $perPersonBill")
    println()

    // Task 4: Convert 2 Ints to String, Double, Float, Long
    println("Convert 2 Ints to String, Double, Float, Long: ")
    val numOne = 10
    val numTwo = 20
    val str1 = numOne.toString()
    val str2 = numTwo.toString()
    val doubleOne = str1.toDouble()
    val doubleTwo = str2.toDouble()
    val floatOne = doubleOne.toFloat()
    val floatTwo = doubleTwo.toFloat()
    val longOne = floatOne.toLong()
    val longTwo = floatTwo.toLong()
    println("Converted values: Longs = $longOne, $longTwo")
    println()

    // Task 5: Add 5 people's weights and convert to pounds
    println("Add 5 people's weights and convert to pounds: ")
    val kg1 = 55.0
    val kg2 = 60.0
    val kg3 = 65.0
    val kg4 = 70.0
    val kg5 = 75.0

    val totalKg = kg1 + kg2 + kg3 + kg4 + kg5
    val totalLb = totalKg * 2.20462

    println("Total weight in kg: $totalKg")
    println("Total weight in pounds: $totalLb")
    println()

    // Task 6: Bank account balances average
    println("Bank account balances average: ")
    val acc1 = 1200.0
    val acc2 = 1400.0
    val acc3 = 1600.0
    val acc4 = 1800.0

    val totalBalance = acc1 + acc2 + acc3 + acc4
    val averageBalance = totalBalance / 4

    println("Total balance: $totalBalance")
    println("Average bank balance: $averageBalance")

    //Tasked was completed by SM
}
