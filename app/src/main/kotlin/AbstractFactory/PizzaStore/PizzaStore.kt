package AbstractFactory.PizzaStore

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

    override fun createPizza(type: String): Pizza {
        val ingredientFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()
        return when (type) {
            "cheese" -> CheesePizza(ingredientFactory).apply { name = "뉴욕 스타일 치즈 피자" }
            "clam" -> ClamPizza(ingredientFactory).apply { name = "뉴욕 스타일 야채 피자" }
            "veggie" -> VeggiePizza(ingredientFactory).apply { name = "뉴욕 스타일 조개 피자" }
            else -> PepperoniPizza(ingredientFactory).apply { name = "뉴욕 스타일 페퍼로니 피자" }
        }
    }

}

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        val ingredientFactory: PizzaIngredientFactory = ChicagoIngredientFactory()
        return when (type) {
            "cheese" -> CheesePizza(ingredientFactory).apply { name = "시카고 스타일 치즈 피자" }
            "clam" -> ClamPizza(ingredientFactory).apply { name = "시카고 스타일 야채 피자" }
            "veggie" -> VeggiePizza(ingredientFactory).apply { name = "시카고 스타일 조개 피자" }
            else -> PepperoniPizza(ingredientFactory).apply { name = "시카고 스타일 페퍼로니 피자" }
        }
    }

}
