package structural.bridge;

class DrawingApiImpl1 implements DrawingApi
{

    @Override
    public void drawCircle(double x, double y, double radius)
    {
        System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
    }

}
