package juego;

import java.util.Scanner;

public class juego {

	public static void dibujarmuñeco(int vidas) {
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
			System.out.println("|                |");
			System.out.println("|          |------------|");
			System.out.println("|          |   O    O   |");
			System.out.println("|          |            |");
			System.out.println("|          |    ____    |");
			System.out.println("|          |------------|");
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
			System.out.println("|                |");
			System.out.println("|          |------------|");
			System.out.println("|          |   O    O   |");
			System.out.println("|          |            |");
			System.out.println("|          |    ____    |");
			System.out.println("|          |------------|");
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
			System.out.println("|                |");
			System.out.println("|          |------------|");
			System.out.println("|          |   O    O   |");
			System.out.println("|          |            |");
			System.out.println("|          |    ____    |");
			System.out.println("|          |------------|");
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
			System.out.println("|                |");
			System.out.println("|          |------------|");
			System.out.println("|          |   O    O   |");
			System.out.println("|          |            |");
			System.out.println("|          |    ____    |");
			System.out.println("|          |------------|");
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
			System.out.println("|                |");
			System.out.println("|          |------------|");
			System.out.println("|          |   X    X   |");
			System.out.println("|          |            |");
			System.out.println("|          |    ____    |");
			System.out.println("|          |------------|");
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

	
	public static boolean comprobarLetraPalbra(String palabra,String letra) {
		boolean encontrado=false;
		
		for (int i = 0; i < palabra.length(); i++) {
			if (letra.equalsIgnoreCase(palabra)) {
				
			}
		}
		
		return encontrado;
	}
	
	
	public static void inicializarVectores( String vPalbra[],String vAciertos[],String vFallos[], String palabra) {
		
		for (int i = 0; i < vFallos.length; i++) {
			vFallos[i]="_ ";
		}
		
		for (int i = 0; i < palabra.length(); i++) {
			vAciertos[i]="_ ";
		}
		
		
	}
	
	public static void main(String[] args) {
		int vidas=8;
		String palabra="Hola", letra="";
		
		String vPalbra[], vAciertos[], vFallos[];
		
		
		vPalbra = new String[palabra.length()];
		vAciertos = new String[palabra.length()];
		vFallos = new String[vidas];
		
		
		Scanner leer= new Scanner(System.in);	
		
		inicializarVectores( String vPalbra[],String vAciertos[],String vFallos[], String palabra);
		
		do {
			
			System.out.println("Escribe una letra");
			letra=leer.next();
			
			
			for (int i = 0; i < palabra.length(); i++) {
				if (letra.equalsIgnoreCase(palabra)) {
					
				}else {
				vidas--;
				dibujarmuñeco(vidas);
				}
			}
			
		} while (vidas>=0);
		

		
		

		

	}
	

}
