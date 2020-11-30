package juego;

import java.util.Scanner;

public class Funciones {

	public static String palaras(String vPalabra[], String palabra) {

		int aux = 10;
		vPalabra = new String[aux];

		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < vPalabra.length; i++) {
			vPalabra[i] = "_";
		}
		for (int i = 0; i < vPalabra.length; i++) {
			System.out.println("Dime unas palabras");
			palabra = leer.next();
			vPalabra[i] = palabra;
		}
		
		

		return palabra;
	}

	// Pinta el muñeco en pantalla dependiendo de las vidas
	public static void dibujarMuneco(int vidas) {
		switch (vidas) {
		case 7:
			System.out.println("_____________________________________");
			break;
		case 6:
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("_____________________________________");
			break;
		case 5:
			System.out.println("__________________");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("_____________________________________");
			break;
		case 4:
			System.out.println("__________________");
			System.out.println("|                |");
			System.out.println("|          ______|______");
			System.out.println("|         |             |");
			System.out.println("|         |   O     O   |");
			System.out.println("|         |      L      |");
			System.out.println("|         |    _____    |");
			System.out.println("|         |_____________|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("_____________________________________");
			break;
		case 3:
			System.out.println("__________________");
			System.out.println("|                |");
			System.out.println("|          ______|______");
			System.out.println("|         |             |");
			System.out.println("|         |   O     O   |");
			System.out.println("|         |      L      |");
			System.out.println("|         |    _____    |");
			System.out.println("|         |_____________|");
			System.out.println("|                |");
			System.out.println("|                |    ");
			System.out.println("|                |   ");
			System.out.println("|                |  ");
			System.out.println("|                | ");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|              ");
			System.out.println("|             ");
			System.out.println("|            ");
			System.out.println("|           ");
			System.out.println("|          ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		case 2:
			System.out.println("__________________");
			System.out.println("|                |");
			System.out.println("|          ______|______");
			System.out.println("|         |             |");
			System.out.println("|         |   O     O   |");
			System.out.println("|         |      L      |");
			System.out.println("|         |    _____    |");
			System.out.println("|         |_____________|");
			System.out.println("|                |");
			System.out.println("|                |    ");
			System.out.println("|                |   ");
			System.out.println("|                |  ");
			System.out.println("|                | ");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|               / \\");
			System.out.println("|              /   \\");
			System.out.println("|             /     \\");
			System.out.println("|            /       \\");
			System.out.println("|           /         \\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("_____________________________________");
			break;
		case 1:
			System.out.println("__________________");
			System.out.println("|                |");
			System.out.println("|          ______|______");
			System.out.println("|         |             |");
			System.out.println("|         |   O     O   |");
			System.out.println("|         |      L      |");
			System.out.println("|         |    _____    |");
			System.out.println("|         |_____________|");
			System.out.println("|                |");
			System.out.println("|                |    ");
			System.out.println("|                |   ");
			System.out.println("|                |  ");
			System.out.println("|                | ");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|               / \\");
			System.out.println("|              /   \\");
			System.out.println("|             /     \\");
			System.out.println("|            /       \\");
			System.out.println("|           /         \\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("_____________________________________");
			break;
		case 0:
			System.out.println("__________________");
			System.out.println("|                |");
			System.out.println("|          ______|______");
			System.out.println("|         |             |");
			System.out.println("|         |   X     X   |");
			System.out.println("|         |      L      |");
			System.out.println("|         |    _____    |");
			System.out.println("|         |_____________|");
			System.out.println("|                |       ");
			System.out.println("|           \\    |    /");
			System.out.println("|            \\   |   /");
			System.out.println("|             \\  |  /");
			System.out.println("|              \\ | /");
			System.out.println("|               \\|/");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|               / \\");
			System.out.println("|              /   \\");
			System.out.println("|             /     \\");
			System.out.println("|            /       \\");
			System.out.println("|           /         \\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("_____________________________________");
			break;
		}
	}

	// Comprueba que una letra existe en la palabra.
	// Devuelve verdadero si se encuentra, falso en caso contrario
	public static boolean comprobarLetraPalabra(String vPalabraSecreta[], String letra) {
		boolean encontrado = false;

		return encontrado;
	}

	public static void inicializarVectores(String palabra, String vPalabraSecreta[], String vAciertos[],
			String vFallos[]) {
		for (int i = 0; i < vFallos.length; i++) {
			vFallos[i] = "_";
		}
		for (int i = 0; i < vPalabraSecreta.length; i++) {
			// Trocear la palabra en letras al vector
			vPalabraSecreta[i] = palabra.substring(i, i + 1);
			vAciertos[i] = "_";
		}

	}

	public static void dibujarAciertorErrores(String[] vFallos, String[] vAciertos) {

		// Imprimir los fallos
		System.out.println("Fallos cometidos:");
		for (int i = 0; i < vFallos.length; i++) {
			if (!vFallos[i].equals("_")) {
				System.out.print(vFallos[i] + " ");
			}
		}

		// System.out.println("");
		System.out.println("\n¡Palabra Secreta!");
		// Imprimir los aciertos
		for (int i = 0; i < vAciertos.length; i++) {
			System.out.print(vAciertos[i] + " ");
		}
	}

	// Comprobar que la letra está en vPalabraSecreta
	// Si esta la guardo en vAciertos, sino la guardo en vFallos
	public static int comprobarLetraIntroducida(int vidas, String letra, String[] vPalabraSecreta, String[] vAciertos,
			String[] vFallos) {

		boolean encontrado = false;

		for (int i = 0; i < vPalabraSecreta.length; i++) {
			if (letra.equalsIgnoreCase(vPalabraSecreta[i])) {
				vAciertos[i] = letra;
				encontrado = true;
			}

		}

		if (encontrado == false) {
			for (int i = 0; i < vFallos.length; i++) {
				if (vFallos[i].equalsIgnoreCase("_")) {
					vFallos[i] = letra;
					vidas--;
					break;
				}
			}
		}

		return vidas;
	}

	public static boolean heGanado(String vAciertos[]) {

		boolean comprobar = true;

		for (int i = 0; i < vAciertos.length; i++) {
			if (vAciertos[i].equals("_")) {
				comprobar = false;
				break;
			}
		}
		return comprobar;
	}
	
}
