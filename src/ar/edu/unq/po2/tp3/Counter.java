package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
		
		private ArrayList<Integer> numeros;
		
		public Counter(ArrayList<Integer> numeros) {
			this.numeros = numeros;
		}
		
		public Integer cantDePares() {
			Integer pares = 0;
			for (Integer numero:numeros) {
				if( this.esPar(numero)) {
					pares = pares +1; 
				}
				else {
					pares = pares +0;
				}
			}
			return pares; 
		}
		public boolean esPar(int x) {
			 if( (x % 2) == 0) {
				return true; 
			 }
			 else {
				return false; 
			 }
		}

		public Integer cantDeImpares() {
			Integer impares = 0;
			for( Integer numero:numeros) {
				impares = impares + this.sumaSiEsImpar(numero);
			}
			return impares;
		}
		
		public Integer cantidadDePares(){
	        int count = (int) numeros.stream().filter(n -> n%2 == 0).count();

	        return  count;  /// Otra forma de hacer
	    }
		
		public Integer sumaSiEsImpar(Integer x) {
			 if( (x % 2) != 0) {
				return 1; 
			 }
			 else {
				return 0; 
			 }
		}
		
		public Integer cantidadDeImpares(){
		        return numeros.size() - cantidadDePares();
		    }   /// Otra forma de hacer
		
	    public Integer cantDeMultiploDe(int otroNumero) {
	    	int multiplos = 0;
			for( int numero:numeros) {
				if(this.esMultiploDe(numero, otroNumero)) {
					multiplos = multiplos + 1; 
				}
				else {
					multiplos = multiplos + 0;
				}			
			}
			return multiplos;
	    }	
	    
	    public boolean esMultiploDe(int unNumero, int otroNumero) {
			if ((unNumero % otroNumero) == 0) {
				return true;
			}	
			else {
				return false;
			}
		}

	    public Integer cantidadDeMultiplosDe(Integer numero){
	        return (int) numeros.stream().filter(n->n%numero==0).count();
	    }    /// Otra forma de hacer
}