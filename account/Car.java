package account;

public class Car {
  private String make;
  private String model;
  private int year;
  private int mileage;

  public Car(String make, String model, int year, int mileage) {
      this.make = make;
      this.model = model;
      this.year = year;
      this.mileage = mileage;
  }

  public void drive(int mileage) {
      this.mileage = mileage;
  }

  public String getMake() {
      return make;
  }

  public String getModel() {
      return model;
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
      Car car = new Car("Toyota", "Camry", 2020, 500);
      System.out.printf("Make: " + car.getMake() + "\nModel: " + car.getModel() + "\nMileage: " + car.getMileage());
    }
}