package in.vamsoft.oops;

public abstract class Car extends Vehicle{
	
	public Car() {
		System.out.println("Car.Car()");
	}

	@Override
	public void start() {
		
		System.out.println("Car.start()");
	}

	
}
