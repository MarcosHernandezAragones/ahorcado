package agenda;

import java.util.Scanner;

public class agenda {

	public static String[][] filaInicializar() {

		String mNombre[][];
		int fila, columna = 2;
		Scanner leer = new Scanner(System.in);

		System.out.println("Escribe El número de filas que quieres en tu agenda");
		fila = leer.nextInt();
		mNombre = new String[fila][columna];
		for (int i = 0; i < mNombre.length; i++) {
			for (int j = 0; j < mNombre[i].length; j++) {
				mNombre[i][j] = "_";
			}
		}

		return mNombre;

	}

	public static void mostrarFilas(String mNombre[][]) {

		for (int i = 0; i < mNombre.length; i++) {
			System.out.println(mNombre[i][0] + " " + mNombre[i][1]);
		}
	}

	public static void mostrarMenu() {
		
		System.out.println("");
		System.out.println("1 para añadir un empleado junto a su telefono");
		System.out.println("2 para mostrar todos los empleados");
		System.out.println("3 para eliminar un empleado");
		System.out.println("4 para editar un empleado");
		System.out.println("5 para salir de la aplicacion");
		
	}
	
	public static void guardarContactos(String mNombre[][]) {

		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < mNombre.length; i++) {

			if (mNombre[i][0].equalsIgnoreCase("_")) {
				System.out.println("Dime el nombre del contacto");
				mNombre[i][0] = leer.next();
				System.out.println("Dime el numero del contacto");
				mNombre[i][1] = leer.next();
				break;
			}

		}

	}

	public static void mostrarContactos(String mNombre[][]) {

		for (int i = 0; i < mNombre.length; i++) {
			System.out.println(mNombre[i][0] + " " + mNombre[i][1]);
		}

	}

	public static void eliminarContacto(String mNombre[][], String eliminar) {
		Scanner leer = new Scanner(System.in);

		System.out.println("Que usuario quieres eliminar");
		eliminar = leer.next();

		for (int i = 0; i < mNombre.length; i++) {
			if (mNombre[i][0].equalsIgnoreCase(eliminar)) {
				mNombre[i][0] = "_";
				mNombre[i][1] = "_";
			}
		}
	}

	public static void editarContacto(String mNombre[][], String editar) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Que usuario quieres editar");
		editar = leer.next();

		for (int i = 0; i < mNombre.length; i++) {

			if (mNombre[i][0].equalsIgnoreCase(editar)) {
				mNombre[i][0] = "_";
				mNombre[i][1] = "_";

				System.out.println("Dime el nuevo nombre del contacto");
				mNombre[i][0] = leer.next();
				System.out.println("Dime el nuevo numero del contacto");
				mNombre[i][1] = leer.next();

			}

		}

	}

	public static void main(String[] args) {

		int fila = 0, columna = 2, aux = 0;
		String mNombre[][];
		String nombre = "", tel = "", eliminar = "", editar = "";
		boolean interruptor = true;

		Scanner leer = new Scanner(System.in);

//---------------------------------------------------------------------------------------filas inicializar

		mNombre = filaInicializar();

//----------------------------------------------------------------------------------------mostrar filas 

		mostrarFilas(mNombre);

		do {
// ---------------------------------------------------------------------------------------mostrar menu
			mostrarMenu();
			
			aux = leer.nextInt();

			switch (aux) {
			case 1:
				System.out.println("añadir");

//---------------------------------------------------------------------------------------guardar
				guardarContactos(mNombre);

				interruptor = false;
				break;

			case 2:
				System.out.println("mostrar");

//---------------------------------------------------------------------------------------mostrar
				mostrarContactos(mNombre);

				interruptor = false;
				break;

			case 3:
				System.out.println("aliminar");

//---------------------------------------------------------------------------------------Eliminar
				eliminarContacto(mNombre, eliminar);

				interruptor = false;
				break;

			case 4:
				System.out.println("editar");

//--------------------------------------------------------------------------------------Editar
				editarContacto(mNombre, editar);

				interruptor = false;
				break;

			case 5:
				System.out.println("salir");
				interruptor = true;
				break;

			}

		} while (interruptor == false);

	}

}
