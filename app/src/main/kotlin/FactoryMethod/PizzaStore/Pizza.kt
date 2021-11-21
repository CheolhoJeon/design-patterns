package FactoryMethod.PizzaStore

sealed class Pizza {
    val name: String = this.javaClass.simpleName

    open fun prepare() = println("피자를 준비합니다.")
    open fun bake() = println("피자를 굽습니다.")
    open fun cut() = println("피자를 자릅니다.")
    open fun box() = println("피자를 포장합니다.")
}

class NYStyleCheesePizza : Pizza()
class NYStylePepperoniPizza : Pizza()
class NYStyleClamPizza : Pizza()
class NYStyleVeggiePizza : Pizza()

class ChicagoStyleCheesePizza : Pizza() {
    override fun cut() = println("피자를 네모난 모양으로 자릅니다.")
}
class ChicagoStylePepperoniPizza : Pizza() {
    override fun cut() = println("피자를 네모난 모양으로 자릅니다.")
}
class ChicagoStyleClamPizza : Pizza() {
    override fun cut() = println("피자를 네모난 모양으로 자릅니다.")
}
class ChicagoStyleVeggiePizza : Pizza() {
    override fun cut() = println("피자를 네모난 모양으로 자릅니다.")
}

