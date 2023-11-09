public abstract class Car {

    private String name;
    private String brand;
    private String fuel;
    private int hp;
    private int numberOfSeats;

    public Car(String name, String brand, String fuel, int hp, int numberOfSeats) {
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
        this.hp = hp;
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuel() {
        return fuel;
    }

    public int getHp() {
        return hp;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", fuel='" + fuel + '\'' +
                ", hp=" + hp +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
