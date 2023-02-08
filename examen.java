package examen_1;

public class examen {
	
	public String primeraM;

	public examen(String palabra_1) {
		
	}
	
	public examen(int lim) {
		
	}
	
	public String primeraMayuscula(String palabra_1) {
		String nombre= palabra_1;
		nombre= nombre.substring(0,1).toUpperCase()+ nombre.substring(1);
		return nombre;	
	}
	
	public String invertirCadena(String frase) {
		String p="";
		for(int i=frase.length()-1; i>=0; i--){
			char momento= frase.charAt(i);
			p=p+momento;
			}
		return p;
	}
	public String vocalesMayuscula(String vocales) {
		String frase = vocales;
	    char[] frase_1 = frase.toCharArray();
	    for (int i = 0; i < frase_1.length; i++) {
	        char posicion = frase_1[i];
	        if (posicion == 'a' || posicion == 'e' || posicion == 'i' || posicion == 'o' || posicion == 'u') {
	            frase_1[i] = Character.toUpperCase(posicion);
	        }
	    }
	    frase = new String(frase_1);
	
		return frase;
	}
	
	public int fizzBuzz(int lim) {
		
		int contador = 0;
		int n = lim;
		
		while (contador <= n) {
			if ((contador % 3 == 0) && (contador % 5 == 0)) {
				System.out.println("fizzBuzz");
			}
			else if(contador%5==0) {
				System.out.println("Buzz");
			}
			else if(contador % 3 == 0) {
				System.out.println("fizz");
			}
			else {
				System.out.println(contador);
			}
			contador++;
		}
		return contador;
	}
	
	public boolean palindromo(String pali) {
		
		String frase= pali;
		boolean condicion = false;
		
		frase=frase.toLowerCase();
		
		for(int i=0, a= frase.length()-1; i<=a;i++, a--) {
				if (frase.charAt(i)==frase.charAt(a)) {
					condicion=true;
				}
				else {
				 condicion=false;
				}
			}
		return condicion;
		
	}
	
}
