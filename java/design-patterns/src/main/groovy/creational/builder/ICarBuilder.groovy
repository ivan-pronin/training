package creational.builder

/**
 * The builder abstraction.
 */
interface ICarBuilder {
	
    Car build()

    ICarBuilder setColor(final String color)

    ICarBuilder setWheels(final int wheels)
}