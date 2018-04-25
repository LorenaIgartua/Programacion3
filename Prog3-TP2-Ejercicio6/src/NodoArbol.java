
public class NodoArbol {
	

		
		private int valor;
		private NodoArbol derecho;
		private NodoArbol izquierdo;
		
		public NodoArbol(int dato) {
			valor = dato;
			derecho = null;
			izquierdo = null;
		}
				
		public void setValor(int valor) {
	        this.valor = valor;
	    }
	 
	    public int getValor() {
	        return valor;
	    }
	
	 
	    public NodoArbol getHojaIzquierda() {
	        return this.izquierdo;
	    }
	 
	    public void setHojaIzquierda(int valor) {
	    	NodoArbol aux = new NodoArbol(valor);
	        this.izquierdo = aux;
	    }
	 
	    public NodoArbol getHojaDerecha() {
	        return this.derecho;
	    }
	 
	    public void setHojaDerecha(int valor) {
	    	NodoArbol aux = new NodoArbol(valor);
	        this.derecho = aux;
	    }
	    
	}


	



