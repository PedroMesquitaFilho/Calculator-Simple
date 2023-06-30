package numeros;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) { 
	Scanner scan = new Scanner (System.in);
		String operacoes;
		Double Number1;
		Double Number2;
		String Operation1 = "Adition";
		String Operation2 = "Subtraction";
		String Operation3 = "Multiplication";
		String Operation4 = "Division";
		
		System.out.println("WELCOME TO CALCULATOR SDG");
		System.out.println("What operation do you want to perform?");
		System.out.println(" - " + Operation1);
		System.out.println(" - " + Operation2);
		System.out.println(" - " + Operation3);
		System.out.println(" - " + Operation4);
		operacoes = scan.nextLine();
		System.out.println("Enter the first number: ");
		Number1 = scan.nextDouble();
		System.out.println("Enter the second number: ");
		Number2 = scan.nextDouble();
		
		if(operacoes.equalsIgnoreCase(Operation1)) {
			System.out.println(Number1 + Number2);
		}
		else if(operacoes.equalsIgnoreCase(Operation2)) {
			System.out.println(Number1 - Number2);
		}
		else if(operacoes.equalsIgnoreCase(Operation3)) {
			System.out.println(Number1 * Number2);
		}
		else if(operacoes.equalsIgnoreCase(Operation4)) {
			System.out.println(Number1 / Number2);
		}
		else {
			System.out.println("ERROR");
		}
		
		}

}
