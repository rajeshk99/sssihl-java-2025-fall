public class Cars {

	//class Engine {}
	//int integer;
	Engine engine;
	Wheels wheels;
	Colour colour;
	Steering steering;
	Accelerator accelerator;
	Breaks breaks;

	//class Engine {}

	public void start() {
		int c;
		// you need the engine to start the car
	}

	public void accelerate() {
		// you need the engine to be in an on state
		// you need the accelerator
	}

	public void stop() {
		// you need the engine to stop the car
	}

	public void break() {
		// you need the ending to be in an on state
		// you need the breaks
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.accelerate();
		car.break();
		car.stop();
	}
}
