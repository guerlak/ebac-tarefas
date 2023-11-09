public class Main {
    public static void main(String[] args) {


        Car car = new Carfactory().createCar("family");
        System.out.println(car.toString());

        Car car1 = new Carfactory().createCar("sport");
        System.out.println(car1.toString());

        Car car2 = new Carfactory().createCar("standard");
        System.out.println(car2.toString());
        
    }
}