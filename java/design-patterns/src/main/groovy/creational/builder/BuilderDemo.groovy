package creational.builder

class BuilderDemo {
	
    ICarBuilder builder

    BuilderDemo(final ICarBuilder builder) {
        this.builder = builder
    }

    Car construct() {
        return builder.setWheels(4)
                      .setColor("Red")
                      .build()
    }

    static void main(final String[] arguments) {
        final ICarBuilder builder = new CarBuilderImpl()
        final BuilderDemo carBuildDirector = new BuilderDemo(builder)
        System.out.println(carBuildDirector.construct())
    }
}