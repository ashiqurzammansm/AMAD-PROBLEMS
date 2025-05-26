fun main() {
    // Task 1: Convert group weights from kg to pounds
    val weightsKg = listOf(60.0, 70.0, 80.0)
    val weightsLb = weightsKg.map { it * 2.20462 }
    println("Weights in pounds: $weightsLb")

    // Task 2: Convert group heights from inches to feet
    val heightsInches = listOf(65.0, 70.0, 72.0)
    val heightsFeet = heightsInches.map { it / 12.0 }
    println("Heights in feet: $heightsFeet")

    // Task 3: Calculate breakfast bill and split
    val eggPrice = 10.0
    val breadPrice = 20.0
    val dalPrice = 30.0
    val totalBill = eggPrice + breadPrice + dalPrice
    val perPersonBill = totalBill / 2
    println("Total breakfast bill: $totalBill, Per person: $perPersonBill")

    // Task 4: Convert 2 Ints to String, Double, Float, Long
    val num1 = 10
    val num2 = 20
    val str1 = num1.toString()
    val str2 = num2.toString()
    val double1 = str1.toDouble()
    val double2 = str2.toDouble()
    val float1 = double1.toFloat()
    val float2 = double2.toFloat()
    val long1 = float1.toLong()
    val long2 = float2.toLong()
    println("Converted values: Longs = $long1, $long2")

    // Task 5: Add 5 people's weights and convert to pounds
    val fiveWeightsKg = listOf(55.0, 60.0, 65.0, 70.0, 75.0)
    val totalWeightKg = fiveWeightsKg.sum()
    val totalWeightLb = totalWeightKg * 2.20462
    println("Total weight in kg: $totalWeightKg, in pounds: $totalWeightLb")

    // Task 6: Bank account balances average
    val accounts = listOf(1200.0, 1400.0, 1600.0, 1800.0)
    val totalBalance = accounts.sum()
    val averageBalance = totalBalance / accounts.size
    println("Average bank balance: $averageBalance")
}
