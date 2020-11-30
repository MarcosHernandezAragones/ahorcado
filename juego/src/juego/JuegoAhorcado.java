package juego;

import java.util.Scanner;

public class JuegoAhorcado {

	public static void main(String[] args) {
		// Vidas totales 7
		Scanner leer = new Scanner(System.in);
		int vidas = 8;
		String palabraSecreta = "";
		String letra;
		String vPalabraSecreta[], vAciertos[], vFallos[];

		String vPalabra[];
		String palabra = "";
		int aux = 10;

		vPalabra = new String[aux];

		Funciones.palaras(vPalabra, palabra);

		vPalabraSecreta = new String[palabraSecreta.length()];
		vAciertos = new String[palabraSecreta.length()];
		vFallos = new String[vidas + 1];
		Funciones.inicializarVectores(palabraSecreta, vPalabraSecreta, vAciertos, vFallos);
		// Estructura general del juego
		do {
			// 1º Preguntar letra
			System.out.println("Dime una letra");
			letra = leer.next();
			// 2º Comprobar si la letra está en la palabra
			vidas = Funciones.comprobarLetraIntroducida(vidas, letra, vPalabraSecreta, vAciertos, vFallos);

			// 3º Dibujar muñeco
			Funciones.dibujarMuneco(vidas);
			// 4º Dibujar aciertos y errores
			Funciones.dibujarAciertorErrores(vFallos, vAciertos);

			// 5ºcomprobar si he ganado

		} while (vidas >= 0 && Funciones.heGanado(vAciertos) == false);

	}

}
