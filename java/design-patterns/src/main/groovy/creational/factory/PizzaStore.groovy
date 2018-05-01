package creational.factory

abstract class PizzaStore {

    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type)
        println "Created pizza! $pizza"
        println pizza.getName()
        println pizza.getType()
    }

    protected abstract Pizza createPizza(String type)
}
