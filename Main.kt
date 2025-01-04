fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Task1
    println("Первый элемент списка:")
    println("Способ 1 (по индексу): ${numbers[0]}")
    println("Способ 2 (first()): ${numbers.first()}")

    // Task2
    println("\nСреднее арифметическое элементов списка:")
    // Meth1: cycle
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    val averageManual = sum.toDouble() / numbers.size
    println("Способ 1 (вручную): $averageManual")
    // Meth2: average()
    println("Способ 2 (average()): ${numbers.average()}")

    // Task3
    println("\nСумма элементов списка:")
    // Meth1: cycle
    var sumManual = 0
    for (number in numbers) {
        sumManual += number
    }
    println("Способ 1 (вручную): $sumManual")
    // Meth2: sum()
    println("Способ 2 (sum()): ${numbers.sum()}")

    // Task4
    println("\nКоличество элементов списка:")
    // Meth1: manual cycle
    var countManual = 0
    for (number in numbers) {
        countManual++
    }
    println("Способ 1 (вручную): $countManual")
    // Meth2: count()
    println("Способ 2 (count()): ${numbers.count()}")

    // Task5
    println("\nСумма двух последних элементов списка:")
    // Meth1: manual cycle
    val lastTwoSumManual = numbers[numbers.size - 1] + numbers[numbers.size - 2]
    println("Способ 1 (вручную): $lastTwoSumManual")
    // Meth2: takeLast()
    val lastTwoSum = numbers.takeLast(2).sum()
    println("Способ 2 (takeLast()): $lastTwoSum")

    // Task6
    println("\nСумма индексов элементов списка:")
    // Meth1: manual cycle
    var indexSumManual = 0
    for (index in numbers.indices) {
        indexSumManual += index
    }
    println("Способ 1 (вручную): $indexSumManual")
    // Meth2: indices()
    val indexSum = numbers.indices.sum()
    println("Способ 2 (indices()): $indexSum")
}
