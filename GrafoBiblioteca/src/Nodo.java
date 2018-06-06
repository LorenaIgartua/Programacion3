//import java.util.ArrayList;
import java.util.LinkedList;
	
public class Nodo {

		 
		    private LinkedList<Arista> adyacencias;
		    private String genero;
		    private String estado;

		    public Nodo (String genero) {
				this.genero = genero;
				this.estado = "BLANCO";
				this.adyacencias = new LinkedList<Arista>();
		    }

		    public void insertarConexion(String destino) {
		    	this.adyacencias.add(new Arista(destino));
		    }
		    
		    public void incrementarPeso(String destino) {
		    	Arista aux = null;
		    	int posicion = 0; 
		    	while ((aux == null) && (posicion < this.adyacencias.size())) {
			    	if(this.adyacencias.get(posicion).getDestino().equals(destino)) {
			    			aux = this.adyacencias.get(posicion);
			    		}
			    	posicion++;
			    }
		    	aux.setPeso(aux.getPeso() + 1);
		    }

		    public LinkedList<Arista> getConexiones() {
		    	return new LinkedList<Arista>(this.adyacencias);
		    }

		    public String toString()  {
		    	return "Nodo: " + this.genero;
		    }
		 
		    public int getContarVecinos() {
		    	return this.adyacencias.size();
		    }

		   
		    public String getGenero() {
		    	return this.genero;
		    }
		    
		    public String getEstado() {
		    	return this.estado;
		    }
		    
		    public void setEstado (String estado) {
		    	this.estado = estado;
		    }
		    
		    public boolean contieneLaArista (String genero2) {
		    	boolean resultado = false;
		    	for (Arista a : this.getConexiones()) {
		    		if(a.getDestino().equals(genero2))
		    			resultado = true;
		    	}
		    	return resultado;
		    }
		   
	}

	
	

