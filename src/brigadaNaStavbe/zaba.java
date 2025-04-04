package brigadaNaStavbe;

import java.util.Scanner;

public class zaba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean zabovalSi;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Žaboval si?");
		
		try {	
			zabovalSi = sc.nextBoolean();
			
			if (zabovalSi == true) {
				System.out.println("Pockaj zavolam o vyplatu");
			} else  { 
				System.out.println("Nevis o svete");
	
			}
		}
		catch(Exception e) {
			System.out.println("Mas mute, idem na cigu");
		}
		
		
	}

}
