package AbstractFactory.PizzaStore

sealed class Pizza {
    lateinit var name: String

    lateinit var dough: Dough
    lateinit var sauce: Sauce
    lateinit var veggies: List<Veggies>
    lateinit var cheese: Cheese
    lateinit var pepperoni: Pepperoni
    lateinit var clams: Clams

    abstract fun prepare()

    open fun bake() = println("피자를 굽습니다.")
    open fun cut() = println("피자를 자릅니다.")
    open fun box() = println("피자를 포장합니다.")
}

class CheesePizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("${name} 준비중...")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}

class ClamPizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("${name} 준비중...")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clams = ingredientFactory.createClams()
    }
}

class PepperoniPizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("${name} 준비중...")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        pepperoni = ingredientFactory.createPepperoni()
    }
}

class VeggiePizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("${name} 준비중...")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        veggies = ingredientFactory.createVeggies()
    }
}