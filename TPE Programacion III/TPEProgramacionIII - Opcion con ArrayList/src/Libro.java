import java.util.ArrayList;


public class Libro {
	
	
	
	
	private String titulo;
	private String autor;
	private String cantidad_paginas;
	private ArrayList<String> generos;
	
	
	public Libro (){
		this.titulo = "";
		this.autor = "";
		this.cantidad_paginas ="";
		this.generos= new ArrayList<String>();
		
	}
	
	public Libro (String t,String a,String c, ArrayList<String> g){
		this.titulo = t;
		this.autor = a;
		this.cantidad_paginas =c;
		this.generos= g;
		
	}
	
	public Libro (String [] items){
		this.titulo = items[0];
		this.autor = items[1];
		this.cantidad_paginas = items[2];
		String[] generos = items[3].split(" ");
		ArrayList<String> aux = new ArrayList<String>();
        for (int i = 0; i < generos.length; i++) {
        	  aux.add(generos[i]);
		}
        
		this.generos= aux;
	}

	@Override
	public String toString() {
		return titulo + ", " + autor + ", " + cantidad_paginas + ", " + generos;
			 
	}
	
	public ArrayList<String> getGeneros () {
		return new ArrayList<String> (this.generos);
	}
	
}
