package in.vamsoft.oops;

import in.vamsoft.training.oops.SportCar;

/**
 * @author vamsoft.
 * 
 *
 */
public class MainClass {

  /**
   * @param args
   *          main method.
   * 
   */
  public static void main(String[] args) {

    final SportCar car = new SportCar("swt");

    car.handBrake();

    car.start();

    car.stop();

    car.fourWheelDrive();

    car.brake();

    System.out.println("car");
  }
}
