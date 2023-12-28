public class Circle implements Shape{
    private double R ;
    private double pi = 3.14;

    public Circle(){}
    public Circle(double r) {
        R = r;
    }


    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public double calcualteArea() {
        return pi*R*R;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*R;
    }


}
