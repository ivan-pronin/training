package structural.decorator

/**
 *
 * Created by ivanp on 27.11.2017
 */
class Whip extends CondimentDecorator {

    Beverage beverage

    Whip(Beverage beverage) {
        this.beverage = beverage
    }

    @Override
    double cost() {
        return 0.10 + beverage.cost()
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", Whip"
    }
}
