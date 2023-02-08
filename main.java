package examen_1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcion;
	    String palabra_1;
	    String palabra_2;
	    String palabra_3;
	    String numero;
	    String palabra_5;
		
		while(true) {
			System.out.println("1. Escribe 1 si quiere convertir la primera letra en mayusculas");
			System.out.println("2. Escribe 2 si quiere invertir una palabra");
			System.out.println("3. Escribe 3 si quiere convertir las vocales de una frase o palabra en mayusculas");
			System.out.println("4. Escribe 4 si quieres saber si son multiplos de 3,5 o ambos");
			System.out.println("5. Escribe 5 si quiere saber si una palabra es palindromo");
			System.out.println("6. Escribe 6 para salir");
			opcion= scan.nextInt();
			
			switch(opcion) {
			
			case 1:
				 System.out.println("Cual es la palabra?");
	        	   Scanner scan_1 = new Scanner(System.in);
	        	   palabra_1= scan_1.nextLine();
	        	   String res = palabra_1;
	        	   examen c = new examen(res);
	        	   System.out.println("La palabra es: " + c.primeraMayuscula(res));
	        	   System.out.println("");
	        	   break;
			case 2:
				 System.out.println("Cual es la palabra?");
	        	   Scanner scan_2 = new Scanner(System.in);
	        	   palabra_2= scan_2.nextLine();
	        	   String frase = palabra_2;
	        	   examen ex_2 = new examen(frase);
	        	   System.out.println("La palabra invertida es: " + ex_2.invertirCadena(frase));
	        	   System.out.println("");
	        	   break;
			case 3:
				 System.out.println("Cual es la palabra?");
	        	   Scanner scan_3 = new Scanner(System.in);
	        	   palabra_3= scan_3.nextLine();
	        	   String vocales = palabra_3;
	        	   examen ex_3 = new examen(vocales);
	        	   System.out.println("La palabra es: " + ex_3.vocalesMayuscula(vocales));
	        	   System.out.println("");
	        	   break;
			case 4:
				 System.out.println("hasta que numero quieres analizar?");
	        	   Scanner scan_4 = new Scanner(System.in);
	        	   numero= scan_4.nextLine();
	        	   String limite = numero;
	        	   int lim = Integer.parseInt(limite);
	        	   examen ex_4 = new examen(lim);
	        	   System.out.println(ex_4.fizzBuzz(lim));
	        	   System.out.println("");
	        	   break;
			case 5:
				 System.out.println("Cual es la palabra?");
	        	   Scanner scan_5 = new Scanner(System.in);
	        	   palabra_5= scan_5.nextLine();
	        	   String pali = palabra_5;
	        	   examen ex_5 = new examen(pali);
	        	   System.out.println("La palabra es: " + ex_5.palindromo(pali));
	        	   System.out.println("");
	        	   break;
			case 6:
				System.out.println("saliendo...");
     		   System.exit(0);
     		   
     		   default:
     			   System.out.println("Valor incorrecto ingrese un valor valido");
			}
		}

	}

}
