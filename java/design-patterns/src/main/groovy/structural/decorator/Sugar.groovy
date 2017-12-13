package structural.decorator

/**
 *
 * Created by ivanp on 27.11.2017
 */
class Sugar extends CondimentDecorator {

    Beverage beverage

    Sugar(Beverage beverage) {
        this.beverage = beverage
    }

    @Override
    double cost() {
        return 0.05 + beverage.cost()
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", Sugar"
    }
}
