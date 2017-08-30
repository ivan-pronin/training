package creational.builder

class CarBuilderImpl implements ICarBuilder {

	Car car

	CarBuilderImpl() {
		car = new Car()
	}

	@Override
	Car build() {
		return car
	}

	@Override
	ICarBuilder setColor(final String color) {
		car.setColor(color)
		return this
	}

	@Override
	ICarBuilder setWheels(final int wheels) {
		car.setWheels(wheels)
		return this
	}
}