import java.util.ArrayList;



public class NodoGenero {

	
	private String genero;
	private ArrayList<Libro> libros;
	private NodoGenero derecho;
	private NodoGenero izquierdo;
	
	public NodoGenero(Libro libro, String genero ) {
		this.genero = genero;
		this.libros = new ArrayList<Libro>();
		this.libros.add(libro);
		this.derecho = null;
		this.izquierdo = null;
	}
			
	public void addLibro(Libro libro) {
		this.libros.add(libro);
    }
 
    public String getGenero() {
        return this.genero;
    }

    public ArrayList<Libro> getLibros () {
    	return new ArrayList<Libro> (libros);
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
