package structural.decorator

/**
 *
 * Created by ivanp on 27.11.2017
 */
abstract class Beverage {

    String description = "Unknown beverage"

    abstract double cost()

    String getDescription() {
        return description
    }
}
