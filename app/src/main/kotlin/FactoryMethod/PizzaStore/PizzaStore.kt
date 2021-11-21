package FactoryMethod.PizzaStore

sealed class PizzaStore {
    fun orderPizza(type: String): Pizza {
        val pizza: Pizza = createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    protected abstract fun createPizza(type: String): Pizza

}

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza =
        when (type) {
            "cheese" -> NYStyleCheesePizza()
            "clam" -> NYStyleClamPizza()
            "veggie" -> NYStyleVeggiePizza()
            else -> NYStylePepperoniPizza()
        }

}

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza =
        when (type) {
            "cheese" -> ChicagoStyleCheesePizza()
            "clam" -> ChicagoStyleClamPizza()
            "veggie" -> ChicagoStyleVeggiePizza()
            else -> ChicagoStylePepperoniPizza()
        }

}
