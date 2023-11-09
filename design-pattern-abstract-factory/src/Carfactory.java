public class Carfactory {

    private java.lang.Exception Exception;

    public Car createCar(String carType){

        switch (carType) {
            case "family":
                return new Creta("Creta", "Hyundai", "Flex", 110, 5);
            case "sport":
                return new Tesla("Model S", "Tesla", "Electric", 200, 4);
            case "standard":
                return new Sandero("Sandero", "Renault", "Flex", 89, 5);

        }
        return null;
   }
}
