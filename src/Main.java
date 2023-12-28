public class Main {
    public static void main(String args[]){
        Car car = new Car();
        Motorcycle moto = new Motorcycle();
        Circle circle = new Circle(6);
        System.out.println(circle.calcualteArea() + " " + circle.calculatePerimeter());

        moto.start();
        car.start();
    }
}
