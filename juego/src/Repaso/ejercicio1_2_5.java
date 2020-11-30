package Repaso;

import java.util.Scanner;

public class ejercicio1_2_5 {

	public static void main(String[] args) {

		String letra = "";

		Scanner leer = new Scanner(System.in);

		System.out.println("Escribe tu letra");
		letra = leer.next();

		if (letra.equalsIgnoreCase("S") || letra.equalsIgnoreCase("N")) {
			System.out.println("La letra es correcta");
		} else {
			System.out.println("La letra es incorrecta");
		}

	}

}
