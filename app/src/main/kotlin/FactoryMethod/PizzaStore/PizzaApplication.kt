package FactoryMethod.PizzaStore

fun main() {
    val nyStore :PizzaStore = NYPizzaStore()
    val chicagoStore :PizzaStore = ChicagoPizzaStore()

    val firstPizza = nyStore.orderPizza("cheese")
    println("길동은 '${firstPizza.name}'를 주문했습니다.")

    val secondPizza = chicagoStore.orderPizza("cheese")
    println("춘향은 '${secondPizza.name}'를 주문했습니다.")
}