
public class Lista {
	
	protected Node first;
	private int tamaño = 0;
	protected Node ultimo;
	
	
	public Lista() {
		first = null;
		ultimo = null;
	}
	
	public Lista(int cantidad) {
		first = null;
		for (int i = 0; i < cantidad; i ++) {
			int dato = (int) (Math.random()*10);
			this.insertarInicio(dato);
		}
	}

	
	public void insertarInicio(int dato) { //inserta al principio
		Node tmp = new Node(dato, null);
		if (this.isEmpty()) {
			tmp.setNext(first);
			first = tmp;
			ultimo = tmp;
			tamaño++;
		}
		else {
			tmp.setNext(first);
			ultimo = first;
			first = tmp;
			tamaño++;
		}
	}
	
	public void insertarFinal(int dato) { //inserta al final
		Node tmp = new Node(dato, null);
		if (this.isEmpty()) {
			tmp.setNext(first);
			first = tmp;
			ultimo = tmp;
			tamaño++;
		}
		else {
			ultimo.setNext(tmp);
			ultimo = tmp;
			tamaño++;
		}
	}
	
	public int extraer() { //sacas el primero
		Node retorno = new Node();
		if (!this.isEmpty()) {
			retorno = this.first;
			this.first = this.first.getNext();
			tamaño--;
			}
		return retorno.getInfo();
	}
	
	public int obtenerDato (int posicion) {
		int dato = -1;
		if ((posicion >= 0) && (posicion < this.tamaño)) {
			int i = 0;
			Node aux = this.first;
			while ( i < posicion ) {
				i++;
				aux = aux.getNext();
			}
			dato = aux.getInfo();
		}
		return dato;
	}
	
	public Lista armarListaRepetidos (Lista l1, Lista l2) {
		Lista aux = new Lista ();
		for (int i = 0; i < l1.tamaño(); i++) {
			int datoLista1 = l1.obtenerDato(i);
			int posicion = 0;
			
			if (l2.tamaño > 0) {
				int datoLista2 = l2.obtenerDato(posicion);
				while ((posicion < l2.tamaño()) && datoLista1 != datoLista2) {
					posicion++;
					datoLista2 = l2.obtenerDato(posicion);
				}
			
				if ((posicion < l2.tamaño) && (datoLista1 == datoLista2)) {
				aux.insertarInicio(datoLista1);
				}
			}
		}
		aux.ordenarLista();
		return aux;
	}
	
	public void ordenarLista () { //ordena de menor a mayor
		
		if (!this.isEmpty()) {
			
			
			Node temporal = this.first;
			int posicion = 0;
			Node auxiliar = temporal.getNext();
			
			for (int i = 0; i < this.tamaño(); i ++) {
			
				while ((posicion < this.tamaño()) && (temporal.getNext() != null) && (temporal.getInfo() <= auxiliar.getInfo())) {
					auxiliar = auxiliar.getNext();
					posicion++;
					}
				if (i < this.tamaño()) {
					
					int dato1 = auxiliar.getInfo();
					int dato2 = temporal.getInfo();
					temporal.setInfo(dato1);
					auxiliar.setInfo(dato2);
				}
				temporal = temporal.getNext();
			}
		}			
	}
		
		
//		
//		if (!this.isEmpty()) {
//			Node primero = this.first;
//			Node cursor = primero.getNext();
//			int i = 0;
//				
//			if ((i < this.tamaño()) && (cursor.getNext() != null)) {
//				while ((primero.getInfo() <= cursor.getInfo())) {
//					cursor = cursor.getNext();
//					i++;
//					}
//			}			
//		}
//	}
	
	public Lista armarListaOrdenada (Lista l1, Lista l2) {
		Lista aux = new Lista ();
		for (int i = 0; i < l1.tamaño(); i++) {
			int datoLista1 = l1.obtenerDato(i);
			
			int posicion = 0;
			int datoLista2 = l2.obtenerDato(posicion);
			
			while ((posicion < l2.tamaño()) && datoLista1 > datoLista2) {
					posicion++;
					datoLista2 = l2.obtenerDato(posicion);
				}
			
			if ((posicion < l2.tamaño) && (datoLista1 == datoLista2)) {
				aux.insertarFinal(datoLista1);
			}
		}
		return aux;
	}
			
	public void imprimirNodo(int n) { 
		Node aux = this.first;
		for (int i = 0; i < n; i++) {
			aux.getNext();
		}
		System.out.println("la informacion del nodo solicitado es: " + aux.getInfo());
	}
	
	public void imprimirLista() { 
		for (int i = 0; i < tamaño; i++) {
			System.out.println("la informacion del nodo " + i +  " es: " + this.obtenerDato(i));
		}
	}
	
	public boolean isEmpty() { 
		return this.first == null;
	}
	
	public int tamaño () { 
		return this.tamaño;
		
	}

}
