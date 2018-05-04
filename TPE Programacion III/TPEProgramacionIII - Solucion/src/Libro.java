
public class Libro {
	
	private String titulo;
	private String autor;
	private String cantidad_paginas;
	private String generos;
	
	
	public Libro (){
		this.titulo = "";
		this.autor = "";
		this.cantidad_paginas ="";
		this.generos= "";
		
	}
	
	public Libro (String t,String a,String c, String g){
		this.titulo = t;
		this.autor = a;
		this.cantidad_paginas =c;
		this.generos= g;
	}
	
	public Libro (String [] items){
		this.titulo = items[0];
		this.autor = items[1];
		this.cantidad_paginas = items[2];
		this.generos = items[3];
	}

	public String toString() {
		return titulo + ", " + autor + ", " + cantidad_paginas + ", " + generos;
	}
	
	public String getGeneros () {
		return this.generos;
	}

	
}
