package javaactivities;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(){
		tyres=4;
		doors=4;
		
	}
	
	public void displayCharacteristics(){ 	//This displays the values of all the variables
		System.out.println("Color of the Car: " + color);
		System.out.println("Make of the Car: " + make);
		System.out.println("Transmission of the Car: " + transmission);
		System.out.println("Number of doors on the car: " + doors);
	    System.out.println("Number of tyres on the car: " + tyres);
	    }
		
	
	public void accelarate(){      //This prints "Car is moving forward."
	
		System.out.println("Car is moving forward.");
		
	}
	public void brake() { //This prints "Car has stopped."

		System.out.println("Car has stopped.");
	}

}
