package fundamentos;

import java.util.Scanner;

public class Consolesjava {
	public static void main(String[] args) {
		
		Scanner X =  new Scanner(System.in);
		String Nome = X.nextLine();
		// X.nextInt();
		//X.nextDouble();
		
		
		System.out.println(Nome);
		System.out.printf("O nome do usuario é"
				+ "  : %s e ele tem %d anos ",Nome,19);
		X.close();
	}

}
