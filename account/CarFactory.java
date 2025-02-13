package account;

public class CarFactory {
    // attributes
    public String make;
    public String model;
    private int year;
    //constructor
    public CarFactory(String carMake, String carModel, int carYear) {
        make = carMake;
        model = carModel;
        year = carYear;
    }

    public CarFactory() {
        make = "Uknown";
        model = "Unknown";
        year = -1;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
      return toString() + "new stuff \n";
    }

    public static void main(String[] args) {
        CarFactory car = new CarFactory();
        CarFactory carEthan = new CarFactory("Hyundai", "VeraCruz", 2011);
        System.out.println("Make: " + car.getMake() + "\n Model: " + car.getModel() + "\n Year: " + car.getYear());
        //System.out.println(carEthan.toString());
    }
}
