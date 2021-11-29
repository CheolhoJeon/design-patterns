package AbstractFactory.PizzaStore

interface PizzaIngredientFactory {

    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClams(): Clams

}

class NYPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough = ThinCrustDough()

    override fun createSauce(): Sauce = MarinaraSauce()

    override fun createCheese(): Cheese = ReggianoCheese()

    override fun createVeggies(): List<Veggies> = listOf(Garlic(), Onion(), Mushroom(), RedPepper())

    override fun createPepperoni(): Pepperoni = SlicedPepperoni()

    override fun createClams(): Clams = FreshClams()

}

class ChicagoIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough = ThickCrustDough()

    override fun createSauce(): Sauce = PlumTomatoSauce()

    override fun createCheese(): Cheese = MozzarellaCheese()

    override fun createVeggies(): List<Veggies> = listOf(Garlic(), Onion(), Mushroom(), RedPepper())

    override fun createPepperoni(): Pepperoni = SlicedPepperoni()

    override fun createClams(): Clams = FrozenClams()

}