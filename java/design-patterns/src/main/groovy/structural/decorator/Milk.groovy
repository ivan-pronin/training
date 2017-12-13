package structural.decorator

/**
 *
 * Created by ivanp on 27.11.2017
 */
class Milk extends CondimentDecorator {

    Beverage beverage

    Milk(Beverage beverage) {
        this.beverage = beverage
    }

    @Override
    double cost() {
        return 0.20 + beverage.cost()
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", Milk"
    }
}
