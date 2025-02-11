package account;

public class Car {
  private String make;
  private String model;
  private int year;
  private int mileage;

  public  Car car = new Car();
  public  Car car1 = new Car(String make, String model, int year) {
      this.make = make;
      this.
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
      car.setMake("Thing");
      System.out.println(car.getMake());
      System.out.println(car.getMileage());
    }
}