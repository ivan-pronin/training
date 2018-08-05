package structural.bridge;

class BridgeDemo {

    static void main(final String[] args) {
        Shape[] shapes = [
                new Circle(1, 2, 3, new DrawingApiImpl1()),
                new Circle(5, 7, 11, new DrawingApiImpl2())
        ]

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5)
            shape.draw()
        }
    }
}
