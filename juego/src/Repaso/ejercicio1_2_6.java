package Repaso;

import java.util.Scanner;


public class ejercicio1_2_6 {

	public static void main(String[] args) {
		int num , aux=0, con=1;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe tu numero");
		num = leer.nextInt();
		
		System.out.println("Los multiplos de 3 son ");
		
		while (aux<=num) {
			if (con%3==0) {
				System.out.println(con);
			}
			aux=aux+1;
		}
		//System.out.println(con);
	}

}
