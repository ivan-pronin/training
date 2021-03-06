package structural.bridge;

class Circle extends Shape
{
    private double x, y, radius;

    public Circle(final double x, final double y, final double radius, final DrawingApi drawingAPI) {
        super(drawingAPI);
        this.x = x;  this.y = y;  this.radius = radius;
    }

    // low-level i.e. Implementation specific
    public void draw()
    {
        drawingAPI.drawCircle(x, y, radius);
    }

    // high-level i.e. Abstraction specific
    public void resizeByPercentage(final double pct)
    {
        radius *= (1.0 + pct / 100.0);
    }
}
