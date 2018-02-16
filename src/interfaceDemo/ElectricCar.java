package interfaceDemo;

public class ElectricCar implements Electronic {
	private boolean isRunning; // indicates whether the car is running
	private String model;
	
	
	
	public ElectricCar(boolean isRunning, String model) {
		this.isRunning = isRunning;
		this.model = model;
	}


	@Override
	public void togglePower() {
		isRunning = !isRunning;
	}

	public void drive() {
		if (isRunning) {
			System.out.println("Fahrvergnuegen");			
		}
		System.out.println("Please start the car");
	}

	@Override
	public String toString() {
		return String.format("%s is %s", model,(isRunning ? "running" : "parked"));
	}
}
