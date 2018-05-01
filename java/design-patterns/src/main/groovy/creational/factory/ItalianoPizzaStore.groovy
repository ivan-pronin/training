package creational.factory

class ItalianoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return new Pizza(name: "Spicy pizza", type: "Italiano")
    }
}
