
public class Arbol {
	
	protected NodoArbol raiz;
//	private int altura = 0;

	public Arbol() {
		this.raiz = null;
	}
	
	public Arbol( int valor ) {
        this.raiz = new NodoArbol( valor );
    }
 
    public Arbol( NodoArbol raiz ) {
        this.raiz = raiz;
    }
 

    public NodoArbol getRaiz() {
        return raiz;
    }
 
    public void setRaiz(int valor) {
    	NodoArbol aux = new NodoArbol(valor);
        this.raiz = aux;
    }
		
	
	public int getRoot() {
		if (!this.isEmpty()) {
			return raiz.getValor();
		}
		else {
			return 0;
		}
	}
	
	public boolean hasElem(int dato) {
		return hasElem (raiz, dato);
	}
	
	private boolean hasElem (NodoArbol raiz, int dato) {
		if (raiz != null) {
			if (raiz.getValor() == dato) {
				return true;
			}
			else if (raiz.getValor() < dato) {
				return hasElem(raiz.getHojaDerecha(),dato);
			}
			else {
				return hasElem (raiz.getHojaIzquierda(),dato);
			}
		}
		return false;
	}
	
	public boolean isEmpty() {
		return raiz == null;
	}
	
	 public void insertar( int valor ) {
	        this.insertar( valor , this.raiz );
	    }
	
	private void insertar (int dato, NodoArbol raiz ) {
        if ( raiz == null ) {
            this.setRaiz(dato);
        }
        else {
            
            if ( dato <= raiz.getValor() ) {
                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(dato);
                }
                else {
                    insertar( dato , raiz.getHojaIzquierda() );
                }
            }
            else {
                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(dato);
                }
                else {
                    insertar( dato, raiz.getHojaDerecha() );
                }
            }
        }
    }
 
    public void printPreOrder() {
    	printPreOrder(raiz);
    }
         
    private void printPreOrder (NodoArbol raiz) {
        if  (raiz == null) {
        	System.out.print("  --  ");  
        }
        else {
        	System.out.print(raiz.getValor() + "  ");     
        	printPreOrder(raiz.getHojaIzquierda());   
        	printPreOrder(raiz.getHojaDerecha());     
        }
    }
    
    
    
    public void printPosOrder() {
    	printPosOrder(raiz);
    }
         
    private void printPosOrder (NodoArbol raiz) {
        if  (raiz == null) {
        	System.out.print("  --  ");  
        }
        else {
        	printPosOrder(raiz.getHojaIzquierda());   
        	printPosOrder(raiz.getHojaDerecha());     
        	System.out.print(raiz.getValor() + "  ");      	
        }
    }
    
   
    public void printInOrder() {
    	printInOrder(raiz);
    }
         
    private void printInOrder (NodoArbol raiz) {
        if  (raiz == null) {
        	System.out.print("  --  ");  
        }
        else {
        	printInOrder(raiz.getHojaIzquierda());   
        	System.out.print(raiz.getValor() + "  ");    
        	printInOrder(raiz.getHojaDerecha());     
        }
    }

    
    public int getHeight(){ //altura   	
    	return getHeight(raiz);
    }
    
    private int getHeight(NodoArbol raiz){ //altura
    	int altura = 0;
    	if (raiz != null) {
    		altura = 1 + Math.max((getHeight(raiz.getHojaDerecha())),(getHeight(raiz.getHojaIzquierda())));
    		return altura;
    		}
    	return altura;
    }

}