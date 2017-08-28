package structural.bridge;

class DrawingApiImpl2 implements DrawingApi
{

    @Override
    public void drawCircle(double x, double y, double radius)
    {
        System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
    }

}
