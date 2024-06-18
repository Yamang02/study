package util;

import java.util.Scanner;

public class Utility {

	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	
	public void printEnterInt( ) {
		System.out.print("please enter int : ");
	}
	
	
	public int getInputInt() {
		Scanner stdIn = this.getScanner();
		this.printEnterInt();
		return stdIn.nextInt(); 
	}
	
}
