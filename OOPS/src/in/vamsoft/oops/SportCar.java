package in.vamsoft.oops;

public  class SportCar extends Car {

	public SportCar() {
		System.out.println("SportCar.Car()");
	}
	
	@Override
	public void stop() {
		System.out.println("SportCar.Car()");
		
	}

	@Override
	public void brake() {
		System.out.println("SportCar.Car()");
		
	}
	@Override
	public void start() {
		
		System.out.println("Car.start()");
	}


	
}
