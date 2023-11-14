package edu.CalculadoraArimetica.controladores;

import java.util.Scanner;
import edu.CalculadoraArimetica.servicios.CalculoImplementacion;
import edu.CalculadoraArimetica.servicios.CalculoInterfaz;
import edu.CalculadoraArimetica.servicios.MenuImplementacion;
import edu.CalculadoraArimetica.servicios.MenuInterfaz;
	
	


public class inicio {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int opcionUser;
			boolean cierraMenu = true ;
			Scanner Scan = new Scanner (System.in);
			MenuInterfaz menu = new MenuImplementacion();
			CalculoInterfaz mi01 = new CalculoImplementacion ();
			while (!cierraMenu) {
				
				opcionUser = menu.mostrarMenu(Scan);
				
				switch(opcionUser) {
				
				
					case 0:
						System.out.println("[0] - Sumará");
						int sumaResultado = mi01.sumar();
						System.out.println(sumaResultado);
						break;
					case 1:
						System.out.println("[1] - Restará");
						int restaResultado = mi01.restar();
						System.out.println(restaResultado);
						break;
					case 2:
						System.out.println("[2] - Multiplicará");
						int mulResultado = mi01.multiplicar();
						System.out.println(mulResultado);
						break;
					case 3:
						System.out.println("[3] - Dividirá");
						int divResultado = mi01.dividir();
						System.out.println(divResultado);
						break;
					case 4:
						System.out.println("[4] - Se hará un modulo de una Suma");
						int ModResult = mi01.moduloSuma();
						System.out.println(ModResult);
						break;
					case 5:
						System.out.println("[5] Se cerrará el Cerrar Menu");
						cierraMenu = true;
						break;

					default:
						System.out.println(" [INFO] - Opción erronea prueba un número entre 0 y 5");
							break;
					
				
				
			}

		}

	}
}
