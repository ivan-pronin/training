package structural.decorator

/**
 *
 * Created by ivanp on 27.11.2017
 */
class HouseBlend extends Beverage {

    HouseBlend() {
        description = "House Blend Coffee"
    }

    @Override
    double cost() {
        return 0.99
    }
}
