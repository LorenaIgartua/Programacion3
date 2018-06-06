
public class Arista {
	
	private String destino;
    private int peso;

    public Arista (String destino) {  // las etiquetas son String, por eso uso compareTo
    	this.destino = destino;
     	this.peso = 1;
    }

    public String getDestino() {
    	return this.destino;
    }
  
     public int getPeso() {
    	return this.peso;
    }

    public void setPeso(int peso)  {
    	this.peso = peso;
    }

    public String toString()  {
    	return "( " + this.destino + ", "  + this.peso  + " )";
    }
    

}
