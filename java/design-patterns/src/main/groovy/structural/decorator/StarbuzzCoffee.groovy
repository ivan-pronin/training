package structural.decorator

/**
 *
 * Created by ivanp on 27.11.2017
 */
class StarbuzzCoffee {

    static void main(String[] args) {
        Beverage beverage = new Espresso()
        printCoffee(beverage)

        Beverage beverage2 = new HouseBlend()
        beverage2 = new Milk(beverage2)
        beverage2 = new Whip(beverage2)
        beverage2 = new Sugar(beverage2)
        printCoffee(beverage2)
    }

    private static printCoffee(Beverage beverage) {
        println "$beverage.getDescription() \$ $beverage.cost()"
    }
}
