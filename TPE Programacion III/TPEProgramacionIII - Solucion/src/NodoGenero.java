import java.util.Iterator;


public class NodoGenero {

	
	private String genero;
	private MySimpleLinkedList libros;
	private NodoGenero derecho;
	private NodoGenero izquierdo;
	
	public NodoGenero(Libro libro, String genero ) {
		this.genero = genero;
		this.libros = new MySimpleLinkedList();
		this.libros.insert(libro);
		this.derecho = null;
		this.izquierdo = null;
	}
			
	public void addLibro(Libro libro) {
		this.libros.insert(libro);
    }
 
    public String getGenero() {
        return this.genero;
    }

    public MySimpleLinkedList getLibros () {
    	MySimpleLinkedList aux = new MySimpleLinkedList();
    	
    	Iterator<Object> it = this.libros.iterator();
 
    	while (it.hasNext() ) {
    		aux.insert(it.next());
    	}
    	return aux;
    }
 
    public NodoGenero getHojaIzquierda() {
        return this.izquierdo;
    }
 
    public void setHojaIzquierda(Libro nuevo, String genero) {
        this.izquierdo = new NodoGenero(nuevo, genero);
    }
 
    public NodoGenero getHojaDerecha() {
        return this.derecho;
    }
 
    public void setHojaDerecha(Libro nuevo, String genero) {
        this.derecho = new NodoGenero(nuevo, genero);
    }
	
	
}
