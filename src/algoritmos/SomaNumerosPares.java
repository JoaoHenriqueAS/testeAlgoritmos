package algoritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SomaNumerosPares {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> listaPares = new ArrayList<Integer>();
		ArrayList<Integer> listaImpares = new ArrayList<Integer>();
		Scanner valor = new Scanner(System.in);
		
		char YN = 'S';
		int somaPares;
		
		while(YN != 'N') {
			System.out.print("Digite um numero: ");
			int n = valor.nextInt();
			lista.add(n);
						
			Scanner resp = new Scanner(System.in);
			System.out.print("Deseja continuar (Y/N)? ");
			YN = resp.next().toUpperCase().charAt(0); 
		}
		
		System.out.println("\nLista Digitada: " + lista);
		
		Collections.sort(lista);
		System.out.println("Lista Ordenada: " + lista + "\n");
		
		for(int i = 0; i < lista.size(); i++) {
			int var = lista.get(i) % 2;
			
			if(var == 0) {
				listaPares.add(lista.get(i));
			}else {
				listaImpares.add(lista.get(i));
			}
		}
		
		System.out.println("Lista numeros pares: " + listaPares);
		System.out.println("Lista numeros impares: " + listaImpares + "\n");
		
		somaPares = listaPares.get(0) + listaPares.get(1);
		
		System.out.println("A soma dos numeros pares que resulta no menor valor é: ");
		System.out.println(listaPares.get(0) + " + " + listaPares.get(1) + " = " + somaPares);
		
	}

}
