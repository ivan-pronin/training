package creational.factory

class FactoryDemo {

    static main(args) {
        PizzaStore italiano = new ItalianoPizzaStore()
        PizzaStore chineese = new ChineesePizzaStore()
        italiano.orderPizza("italiano")
        chineese.orderPizza("chineese")
    }
}
