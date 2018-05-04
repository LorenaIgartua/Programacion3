
public class ArbolIndex {
	
	protected NodoGenero raiz;

	public ArbolIndex() {
		this.raiz = null;
	}
	
	public MySimpleLinkedList librosDe(String genero) {
		return librosDe (raiz, genero);
	}
	
	private MySimpleLinkedList librosDe (NodoGenero raiz, String genero) {
		if (raiz != null) {
			if (genero.compareTo(raiz.getGenero()) == 0 ) {
				return raiz.getLibros();
			}
			else if (genero.compareTo(raiz.getGenero()) > 0) {
				return librosDe(raiz.getHojaDerecha(),genero);
			}
			else {
				return librosDe (raiz.getHojaIzquierda(),genero);
			}
		}
		return null;
	}
	
	public boolean isEmpty() {
		return raiz == null;
	}
	
	public void insertar( Libro nuevo ) {
		String[] generos = nuevo.getGeneros().split(" ");
		 	for (String genero : generos) {
		 		this.insertar( this.raiz, nuevo, genero  );
		 }
	        
	 }
	
	private void insertar ( NodoGenero raiz , Libro nuevo, String genero  ) {
        if ( raiz == null ) {
        	this.raiz = new NodoGenero(nuevo, genero);
        }
        else {
            if ( genero.compareTo(raiz.getGenero()) == 0 ) {
            	raiz.addLibro(nuevo);
            }
            else if ( genero.compareTo(raiz.getGenero()) < 0 ) {
                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(nuevo, genero);
                }
                else {
                    insertar( raiz.getHojaIzquierda(), nuevo, genero );
                }
            }
            else {
                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(nuevo, genero);
                }
                else {
                    insertar( raiz.getHojaDerecha(), nuevo, genero );
                }
            }
        }
    }
 
    public void printInOrder() {
    	printInOrder(this.raiz);
    }
         
    private void printInOrder (NodoGenero raiz) {
        if  (raiz != null) {
        	printInOrder(raiz.getHojaIzquierda());   
        	System.out.println(raiz.getGenero() + ",  ");    
        	printInOrder(raiz.getHojaDerecha());     
        }
    }

}
