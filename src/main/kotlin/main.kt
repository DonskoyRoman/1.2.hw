package ru.netology


fun main() {
    val minTax = 35
    val trans = 10000
    val commissionRate = 0.0075
    var commission = trans * commissionRate

    if (commission < minTax) {
        commission = minTax.toDouble()
    }

    val amount = trans - commission
    println("Сумма перевода: $amount рублей")
}


//
//        val mintax = 35
//        val trans = 100000
//    var tax = trans % 0.75
//        if (tax < mintax) {
//            tax = mintax.toDouble()
//
//        }
//    val amount = (trans - tax)  // сумма перевода - коммиссия
//    println(amount)


//    val itemPrice = 100
//    val itemCount = 11
//    val discount = 100
//    val discountStart = 10_000
//
//    var totalPrice = itemPrice * itemCount
//    if (totalPrice > discountStart) {
//        totalPrice -= discount
//    }

//    println(totalPrice)
//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments:") //${args.joinToString()}")
