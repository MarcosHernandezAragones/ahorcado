package juego;

import java.util.Scanner;

public class algo {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String vPalabra[];
		String palabra="";
		int aux =10;
		
		vPalabra = new String[aux];
		
		for (int i = 0; i < vPalabra.length; i++) {
			vPalabra[i]="_";
		}
		
		for (int i = 0; i < vPalabra.length; i++) {
			System.out.println("Dime unas palabras");
			palabra = leer.next();
			vPalabra[i]=palabra;
		}
		
		for (int i = 0; i < vPalabra.length; i++) {
			System.out.print(vPalabra[i] + " ");	
		}

	}

}
