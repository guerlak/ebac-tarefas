public abstract class Car {

    private String name;
    private String brand;
    private String model;
    private int hp;
    private int year;


    public Car(String name, String brand, String model, int hp, int year) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", hp=" + hp +
                ", year=" + year +
                '}';
    }
}
