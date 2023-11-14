import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car fusca = new Fusca("Fusca", "VW", "Fusca 1", 65, 1985);
        Fit fit = new Fit("Fit", "Honda", "SX", 89, 2010);
        Corolla corolla = new Corolla("Corolla", "Toyota", "Confort 2.0", 130, 2020);

        List<Car> carsList = new ArrayList<>();

        carsList.add(fusca);
        carsList.add(fit);
        carsList.add(corolla);

        for (Car c: carsList){
            System.out.println(c.toString());
        }
    }
}