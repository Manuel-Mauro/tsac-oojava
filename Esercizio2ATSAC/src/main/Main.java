package main;

public class Main {
	
	public static void main(String[] args) {
		int totChiamate = 1000;
		
		TemperatureSensor ts = new TemperatureSensor();
		ts.setListener(
			tl()
		);
		
		for (int i = 0; i < totChiamate; i++) {
			ts.next();
			System.out.println();
		}	
	}

	private static TemperatureSensorListener tl() {
		return null;
	}

}
