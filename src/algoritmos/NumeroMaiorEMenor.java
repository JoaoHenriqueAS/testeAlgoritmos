package algoritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumeroMaiorEMenor {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner valor = new Scanner(System.in);
		
		char YN = 'S';
		
		while(YN != 'N') {
			System.out.print("Digite um numero: ");
			int n = valor.nextInt();
			lista.add(n);
						
			Scanner resp = new Scanner(System.in);
			System.out.print("Deseja continuar (Y/N)? ");
			YN = resp.next().toUpperCase().charAt(0);//.charAt(0); 
		}
		
		System.out.print("Lista digitada: [");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
		System.out.println("]");
		
		Collections.sort(lista);
		System.out.print("Lista ordenada: ");
		System.out.println(lista);
		
		System.out.println("Menor numero: " + lista.get(0));
		int end = lista.size() - 1;
		System.out.println("Maior numero: " + lista.get(end));
		
		
		
	}

}
