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

	public static void main(String[] args) {

		int fila = 0, columna = 2, aux = 0;
		String mNombre[][];
		String nombre = "", tel = "";
		boolean interruptor = true;

		Scanner leer = new Scanner(System.in);

//---------------------------------------------------------------------------------------filas inicializar

		mNombre = filaInicializar();

//----------------------------------------------------------------------------------------filas	

		for (int i = 0; i < mNombre.length; i++) {
			System.out.println(mNombre[i][0] + " " + mNombre[i][1]);
		}

		do {
			System.out.println("1 para añadir un empleado junto a su telefono");
			System.out.println("2 para mostrar todos los empleados");
			System.out.println("3 para eliminar un empleado");
			System.out.println("4 para editar un empleado");
			System.out.println("5 para salir de la aplicacion");
			aux = leer.nextInt();

			switch (aux) {
			case 1:
				System.out.println("añadir");

				// --------------------------------------------nombre y tel

				System.out.println("Dime su nombre");
				nombre = leer.next();
				System.out.println("Dime su telefono");
				tel = leer.next();

				// ---------------------------------------------guardar

				for (int i = 0; i < mNombre.length; i++) {
					if (mNombre[i][0] == "_") {
						mNombre[i][0] = nombre;
						mNombre[i][1] = tel;
					}
				}

				interruptor = false;
				break;
			case 2:
				System.out.println("mostrar");
				for (int i = 0; i < mNombre.length; i++) {
					System.out.println(mNombre[i][0] + " " + mNombre[i][1]);
				}
				interruptor = false;
				break;
			case 3:
				System.out.println("aliminar");
				interruptor = false;
				break;
			case 4:
				System.out.println("editar");
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
