package algoritmos;

import java.util.Scanner;

public class SequenciaFibonnacci {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 1;
		int nf;
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n = valor.nextInt();
		
		System.out.print(n1 + "," + n2);
		for(int count = 3; count <= n; count++) {
			nf = n1 + n2;
			System.out.print("," + nf);
			n1 = n2;
			n2 = nf;
		}
	}


}
