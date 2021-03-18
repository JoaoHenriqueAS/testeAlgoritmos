package algoritmos;

import javax.swing.JOptionPane;

public class palindromo {

	public static void main(String[] args) {

		String frase = JOptionPane.showInputDialog(null,"Digite uma frase: ");
		frase = frase.replace(" ", "").toLowerCase();
		String fraseInvertida = new StringBuilder(frase).reverse().toString();
				
		if(frase.equals(fraseInvertida)) {
			System.out.println(1);
		} else System.out.println(0);
		
	}

}
