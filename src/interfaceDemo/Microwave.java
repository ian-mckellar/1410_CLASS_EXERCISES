package interfaceDemo;

public class Microwave implements Electronic {
	private boolean powerOn;
	
	@Override
	public void togglePower() {
		powerOn = !powerOn;	
	}
	
	@Override
	public String toString() {
		return "Micowave [powerOn=" + powerOn + "]";
	}



}
