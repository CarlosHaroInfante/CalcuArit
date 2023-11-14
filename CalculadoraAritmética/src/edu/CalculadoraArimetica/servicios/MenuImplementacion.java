package edu.CalculadoraArimetica.servicios;


import java.util.Scanner;


public class MenuImplementacion implements MenuInterfaz {


		

		public int mostrarMenu(Scanner Scan) {
			
			int opcion;
			
			System.out.println("----------------------------------------");
			System.out.println("0. Sumar");
			System.out.println("1. Restar");
			System.out.println("2. Multiplicar");
			System.out.println("3. Dividir");
			System.out.println("4. Módulo de una Suma");
			System.out.println("5. Cerrar Menú");
			System.out.println("----------------------------------------");
			System.out.println("          Elige una opción        ");
			System.out.println("----------------------------------------");

			opcion = Scan.nextInt();
			
			return opcion;
		}
		
	}

