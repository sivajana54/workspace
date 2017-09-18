package in.vamsoft.training.oops;

public class Plane extends Vehicle implements Flying {
	public Plane() {
	System.out.println("Plane.Plane()");	// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Plane.start()");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Plane.stop()");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Plane.brake()");
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Plane.takeOff()");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Plane.land()");
	}

}
