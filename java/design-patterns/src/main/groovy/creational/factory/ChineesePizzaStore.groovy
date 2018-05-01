package creational.factory

class ChineesePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return new Pizza(name: "Pizza with vegetables", type: "Chineese")
    }
}
