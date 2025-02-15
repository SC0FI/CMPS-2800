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
    //backup method, just in case no arguments are provided
    public CarFactory() {
        make = "Unknown";
        model = "Unknown";
        year = -1;
    }
    //getMake, self explanatory.
    public String getMake() {
        return make;
    }

    //setModel, in case the user forgets, inputs wrong model
    public void setModel(String make) {
        this.model = model;
    }

    //getModel, self explanatory.
    public String getModel() {
        return model;
    }
    //getYear, self explanatory.
    public int getYear() {
        return year;
    }
    //toString, converts the values into a readable format.
    public String toString(){
        return "Make: " + make + "\nModel: " + model + "\nYear: " + year;
    }


    public static void main(String[] args) {
        CarFactory car = new CarFactory();
        CarFactory carEthan = new CarFactory("Hyundai", "VeraCruz", 2011);
        CarFactory carJacob = new CarFactory("Honda", "Accord", 2017);
        System.out.println(carJacob.toString());
    }
}
