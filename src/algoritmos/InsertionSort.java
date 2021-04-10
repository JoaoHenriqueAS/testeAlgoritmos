package algoritmos;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> insertionSort = new ArrayList<>();
		Scanner valor = new Scanner(System.in);
		
		char parar = 'N';
		int stop = parar;
		char YN = 'S';
		
		while(YN != 'N') {
			System.out.print("Digite um numero (Digite 'N' para parar) : ");
			int n = valor.nextInt();
			
			if(n != stop) {
				insertionSort.add(n);
			}
			
			YN = 'S';			
						
		}	
		
		System.out.println(insertionSort);
		
	}
	
}
