package structural.decorator

/**
 *
 * Created by ivanp on 27.11.2017
 */
class Espresso extends Beverage {

    Espresso() {
        description = "Espresso"
    }

    @Override
    double cost() {
        return 1.99
    }
}
