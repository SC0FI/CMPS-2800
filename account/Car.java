package account;

public class Car {
  private String make;
  private String model;
  private int year;
  private int mileage;

  public  Car(String make, String model, int year, int mileage) {
      this.make = make;
      this.model = model;
      this.year = year;
      this.mileage = mileage;
    }
    public Car() {}

    public Car(String make, String model) {
      this.make = make;
      this.model = model;
    }

    public Car(String make, String model, int year) {
      this.make = make;
      this.model = model;
      this.year = year;
    }

    public void drive(int mileage) {
      this.mileage = mileage;
  }

  public String getMake() {
      return make;
  }

  public int getMileage() {
      return mileage;
  }

  public void setMake(String make) {
      this.make = make;
  }

  public void setMileage(int mileage) {
      this.mileage = mileage;
  }

  public static void main(String args[]) {
      Car car = new Car("Honda", "Accord", 2017);
      car.setMake("Thing");
      System.out.println(car.getMake());
      System.out.println(car.getMileage());
    }
}