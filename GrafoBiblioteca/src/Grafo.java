import java.util.ArrayList;
import java.util.LinkedList;

public class Grafo {

	    private LinkedList<Nodo> nodos;

	    public Grafo() {
			this.nodos = new LinkedList<Nodo>();
	    }

	    public boolean existeNodo (String genero) {
	    	boolean resultado = false;
	    	int posicion = 0;
	    	while (( posicion < nodos.size()) && (!resultado)) {
	    		if (this.nodos.get(posicion).getGenero().equals(genero)) {
	    			resultado = true;
	    		}
	    		posicion++;
	    	}
	    	return resultado;
	    }
	    
	    private void insertarNodo (String genero) {  
	    		Nodo nuevo = new Nodo(genero);
	    		nodos.add(nuevo);
	    }
	    
	    public Nodo getVertice (String genero) {
	    	Nodo aux = null;
	    	int posicion = 0; 
	    	while ((aux == null) && (posicion < this.nodos.size())) {
		    	if(this.nodos.get(posicion).getGenero().equals(genero)) {
		    			aux = this.nodos.get(posicion);
		    		}
		    	posicion++;
		    }
	    	return aux;
	    }
	    
	    public ArrayList<Nodo> getListaGeneros () {
	    	return new ArrayList<Nodo>(this.nodos);
	    }
	    
	    public void insertarGenero ( String genero1, String genero2) {
	       	if (!existeNodo(genero1))
	    		this.insertarNodo(genero1);
	    	if (!existeNodo(genero2)) 
	    		this.insertarNodo(genero2);
	    	if (!this.getVertice(genero1).contieneLaArista(genero2)) {
	    		this.getVertice(genero1).insertarConexion(genero2);
	    	}
	    	else {
	    		this.getVertice(genero1).incrementarPeso(genero2);
	    	}
	    }
	    

		public void setearEstadoVertices () {
	    	for (Nodo nodo : this.getListaGeneros()) {
	    		nodo.setEstado("BLANCO");
	    	}
	    }
		
		public void obtenerNGenerosSiguientes (String nodo, int n) { 		 
			LinkedList<Arista> aux = this.getVertice(nodo).getConexiones();
			ordenarLista (aux);
			
			if (n > aux.size()) 
				n = aux.size();
			
			System.out.println( "Los "  + n + " generos mas buscados luego de " + nodo + " son:");
			
			
			for (int i = 0; i < n; i++) {
				System.out.println( aux.get(i).getDestino() + ": " + aux.get(i).getPeso() + " veces.");
			}
		 }
			
	private void ordenarLista (LinkedList<Arista> lista) { //ordena de menor a mayor
			if (!lista.isEmpty()) {
				Arista aux = null;
					
				for (int i = 0 ; i < lista.size() - 1; i++) {
					for (int j = 0 ; j < lista.size() - 1; j++){
						if ((lista.get(j).getPeso() < lista.get(j+1).getPeso())) {
							aux = lista.get(j);
							lista.set(j,lista.get(j+1));
							lista.set(j+1,aux);
						}
						}
					}
				}
	}
			
		 public void obtenerTodosLosGeneros(String nodo) { 
			  this.setearEstadoVertices();
			  
			  LinkedList<Nodo> hijos = obtenerHijos(nodo);
			  System.out.println( "Los generos buscados luego de " + nodo + " son:");
			  for (Nodo n : hijos ) {
					System.out.print(n.getGenero() + ", ");
				}
		}
		 
		 private LinkedList<Nodo> obtenerHijos(String nodo) { 
			  this.setearEstadoVertices();
			  
			  LinkedList<Nodo> cola = new LinkedList<Nodo>();
			  LinkedList<Nodo> retorno = new LinkedList<Nodo>();
			  this.getVertice(nodo).setEstado("AMARILLO");
			  cola.add(this.getVertice(nodo));
			  
			  while (!cola.isEmpty()) {
				  Nodo aux = cola.remove(0);
					  retorno.add(aux);
				  for (Arista a : aux.getConexiones()) {
					  Nodo actual = this.getVertice(a.getDestino());
						  if (actual.getEstado() == "BLANCO") {
							  actual.setEstado("AMARILLO");
								cola.add(actual);
							}
				  }
			  }
			  return retorno;
		}
		 	 
		
		public  void obtenerGenerosAfines (String origen) {
			this.setearEstadoVertices ();
			LinkedList<Nodo> cola = new LinkedList<Nodo>();
			LinkedList<String> afines = new LinkedList<String>();
			
			cola = obtenerHijos(origen);
			
			while (!cola.isEmpty()) {
				  Nodo aux = cola.remove(0);
				  if ( this.esAfin(origen,aux.getGenero(),afines)) 
					  afines.add(aux.getGenero());

			  }
			System.out.println( "Los generos afines a " + origen + " son:");
			for (String n : afines ) {
				System.out.print(n + " , ");
			}
		}
		
		private boolean esAfin (String origen, String nodo, LinkedList<String> afines) {
			 boolean r = false;
			 this.setearEstadoVertices();
			 LinkedList<Nodo> cola = new LinkedList<Nodo>();
			  
			  this.getVertice(nodo).setEstado("AMARILLO");
			  cola.add(this.getVertice(nodo));
			  
			  while (!cola.isEmpty() && !r) {
				  Nodo aux = cola.remove(0);
				  if (esAfinPorOrigen(origen, aux.getGenero()) || 
						  esAfinPorHijo (aux.getGenero(),afines)) {
					  r = true;
				  }
				  else {
				   for (Arista a : aux.getConexiones()) {
					  Nodo actual = this.getVertice(a.getDestino());
						  if (actual.getEstado() == "BLANCO") {
							  actual.setEstado("AMARILLO");
								cola.add(actual);
							}
				   		}
				  }
			  }
			  return r;
		}		
					
		private boolean esAfinPorOrigen (String origen, String nodo) {
			LinkedList<Arista> aux = this.getVertice(nodo).getConexiones();
			for (Arista a : aux) {
				if ( a.getDestino().equals(origen))
						return true;
			}
			return false;
		}
		
		private boolean esAfinPorHijo (String nodo, LinkedList<String> afines) {
			LinkedList<Arista> aux = this.getVertice(nodo).getConexiones();
			for (Arista a : aux) {
				if (afines.contains(a.getDestino())) 
					return true;
			}
			return false;
		}	    

}
