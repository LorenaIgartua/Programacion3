

public class Tablero {

	  private int matriz[][];
	  private boolean usados[];
	  private int n;
	  private int k;
	  private int s;
	  
	  public Tablero(int n, int k, int s) {
	    this.matriz = new int[n][n];
	    this.n = n;
	    this.k = k;
	    this.usados = new boolean[k+1];
	    this.s = s;
	  }
	  
	  public boolean esSolucion() {
	    for (int i = 0; i < n; i++) {
	      int sumFila = 0;
	      int sumCol = 0;
	
	      for (int j = 0; j < n; j++) {
	        sumFila += matriz[i][j];
	        sumCol += matriz[j][i];
	      }
	      if (sumFila != s || sumCol != s)
	    	  return false;
	    }
	    return true;
	  }
	  
	  public boolean esValido() {
		    for (int i = 0; i < n; i++) {
		      int sumFila = 0;
		      int sumCol = 0;
		
		      for (int j = 0; j < n; j++) {
		        sumFila += matriz[i][j];
		        sumCol += matriz[j][i];
		      }
		      if (sumFila > s || sumCol > s)
		    	  return false;
		    }
		    return true;
		  }
	  
	  public boolean backtrackingTablero(int posicion) {
		    if (posicion == n*n) { 
		    	return esSolucion();
		    }
		    for (int valor = 1; valor <= k; valor++) {
		    	if (!usados[valor]) { 
		    		usados[valor] = true;
		    		matriz[posicion/n][posicion%n] = valor;
		    		if (esValido()) {
		    			if (backtrackingTablero(posicion+1)) {
			    			return true;
		    			}   
		    		} 
			      matriz[posicion/n][posicion%n] = 0;
			      usados[valor] = false; 
			     } 	  
		    }
		    return false;
		  }
	
	  public void imprimirSolucion () {
	    for (int fila = 0; fila < n; fila++) {
	      for (int col = 0; col < n; col++) {
	        System.out.print(matriz[fila][col]);
	        System.out.print(' ');
	      }
	      System.out.println();
	    }
	    System.out.println();
	  }
	  
	  

	
}
