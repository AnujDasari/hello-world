package co.edurekatraining;

public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.displayMessage();
	}
	
	public void displayMessage() { // changes made by developer2 and developer1
		System.out.println("Hello All...Welcome!");
	}

	// commented out by dev2
//	public int add(int a, int b) {
//		return a+b;
//	}
	
	public int add(int a, int b) {
		int sumOfNumbers = a + b;
		return sumOfNumbers;
	}
	
	//cc1
	//cc2
}
