package interfaceDemo;

public class ElectronicApp {

	public static void main(String[] args) {
		System.out.println("Microwave: ");
		Microwave sharp = new Microwave();
		System.out.println("sharp" + sharp + "\n");
		sharp.togglePower();
		System.out.println("sharp" + sharp +"\n");
		
		System.out.println();
		
		System.out.println("Electric car:");
		ElectricCar tesla = new ElectricCar(false, "Roadster");
		tesla.toString();
		tesla.togglePower();
		tesla.drive();
		tesla.togglePower();
		System.out.println(tesla.toString());
		tesla.drive();
		
		System.out.println();
		
		Electronic[] electronics = {sharp, tesla};
		for (Electronic e : electronics) {
			e.togglePower();
			System.out.println(e);
			if (e instanceof ElectricCar) {
				((ElectricCar) e).drive();
			}
		}
	}

}
