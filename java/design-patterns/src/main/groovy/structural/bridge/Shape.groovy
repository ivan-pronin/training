package structural.bridge;

public abstract class Shape
{
    protected DrawingApi drawingAPI;

    protected Shape(final DrawingApi drawingAPI)
    {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw(); // low-level

    public abstract void resizeByPercentage(final double pct); // high-level
}
