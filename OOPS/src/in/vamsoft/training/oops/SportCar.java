package in.vamsoft.training.oops;

public  class SportCar extends Car {

	public SportCar(String model) {
		// TODO Auto-generated constructor stub
		
		System.out.println("SportCar.SportCar()");
		System.out.println(model);
	}
	 
	
	public SportCar() {
		// TODO Auto-generated constructor stub
		System.out.println("SportCar.SportCar()");
	}


	@Override
	public void stop() {
		System.out.println("SportCar.stop()");
		
	}

	@Override
	public void brake() {
		System.out.println("SportCar.brake()");
		
	}
	@Override
	public void start() {
		
		System.out.println("SportCar.start()");
	}

    public void fourWheelDrive() {
        System.out.println("SportCar.fourWheelDrive()");	
    }
	public void handBrake() {
		System.out.println("SportCar.handrake()");
		
	}
}
