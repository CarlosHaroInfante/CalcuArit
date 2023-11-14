package edu.CalculadoraArimetica.servicios;

import java.util.Scanner;

public class CalculoImplementacion implements CalculoInterfaz {

	

		public int sumar() {
			
			System.out.print("Seleccion de Suma     ");
			Scanner num1 = new Scanner (System.in);
			Scanner num2 = new Scanner (System.in);
			int numerosuma = num1.nextInt();
			int numerosuma2 = num2.nextInt();
			int sumaResultado = numerosuma + numerosuma2;
			return sumaResultado;	
		}
		
		
	 public int restar() {
			
			System.out.print("Seleccion de Resta    ");
			Scanner num1 = new Scanner (System.in);
			Scanner num2 = new Scanner (System.in);
			int numeroresta = num1.nextInt();
			int numeroresta2 = num2.nextInt();
			int restaResultado = numeroresta - numeroresta2;
			return restaResultado;
			
		}
		
	 
	 public int multiplicar() {
			
			System.out.print("Seleccion de Multiplicacion    ");
			Scanner num1 = new Scanner (System.in);
			Scanner num2 = new Scanner (System.in);
			int numMul = num1.nextInt();
			int numMul2 = num2.nextInt();
			int mulResultado = numMul * numMul2;
			return mulResultado;	
		}
	 
	 
	 public int dividir() {
			
			System.out.print("Seleccion de Multiplicacion    ");
			Scanner num1 = new Scanner (System.in);
			Scanner num2 = new Scanner (System.in);
			int numDiv = num1.nextInt();
			int numDiv2 = num2.nextInt();
			int divResultado = numDiv / numDiv2;
			return divResultado;	
		}
		
		
	 
	 public int moduloSuma() {
			
			System.out.print("Seleccion de Modulo de Suma    ");
			Scanner num1 = new Scanner (System.in);
			Scanner num2 = new Scanner (System.in);
			int numMod = num1.nextInt();
			int numMod2 = num2.nextInt();
			int ModResult = numMod % numMod2;
			return ModResult;
		}
	 
	}

