package creational.builder

class CarBuildDirector {
	
    ICarBuilder builder;

    CarBuildDirector(final ICarBuilder builder) {
        this.builder = builder;
    }

    Car construct() {
        return builder.setWheels(4)
                      .setColor("Red")
                      .build();
    }

    static void main(final String[] arguments) {
        final ICarBuilder builder = new CarBuilderImpl();
        final CarBuildDirector carBuildDirector = new CarBuildDirector(builder);
        System.out.println(carBuildDirector.construct());
    }
}