package exo1;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args){
		String test = null;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		MyStringUtils compare = new MyStringUtils();
		
		System.out.println("Taper votre chaine : ");
		test = scan.nextLine();
		
		compare.setTeststring(test);
		
		if(compare.isNullOrEmpty()){
			System.out.println("Votre chaine est vide ou null");
		}
		else 
			System.out.println(test);
	}

}
