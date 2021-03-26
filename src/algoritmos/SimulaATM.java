package algoritmos;

import java.util.Scanner;

public class SimulaATM {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		System.out.print("Digite o valor do saque: ");
		int saque = valor.nextInt();
		
		int cedula[] = {100,50,20,10,5,2};
		int qtdNota;
		
		System.out.println("\nVocê recebera: ");
		for(int i = 0; i < cedula.length; i++) {
			qtdNota = saque / cedula[i];
			System.out.println(qtdNota + " Notas de R$ " + cedula[i] + ",00");
			saque = saque % cedula[i];
			
			if(saque == 0) {
				i = cedula.length + 1;
			}
		}
	}
}
