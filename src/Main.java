public class Main {
    public static void main(String args[]){
        Vehicle car = new Car();
        Vehicle moto = new Motorcycle();
        Shape circle = new Circle(6);

        System.out.println(circle.calcualteArea() + " " + circle.calculatePerimeter());

        moto.start();
        car.start();
    }
}
