
public class Prueba {
	
	
	
//    public void delete (int dato) {
//    	delete(dato, raiz);
//    	
//    }
//
//	private void delete(int dato, NodoArbol raiz ) {
//		
//		Arbol aux = new Arbol();
//		  aux.contiene(raiz,dato);
//		  
//		  
//		
//
//		if (! aux.isEmpty()){ // si el arbol es null no hace nada mas
//			if ((aux.raiz.getHojaDerecha() == null ) && (aux.raiz.getHojaIzquierda() == null)) {
//	  			  aux.raiz = null;
//	  		  }
////			
////			if (dato == raiz.getValor()){ // se mira si el dato del nodo es el que se quiere borrar
////			
////				if ((raiz.getHojaDerecha() == null) && raiz.getHojaIzquierda() == null) {     /* Caso 1: No tiene hijos */
////					deleteNodoSinHijos( dato, raiz );
////				}
////				else if (((raiz.getHojaDerecha() == null) && (raiz.getHojaIzquierda() != null)) || 
////						((raiz.getHojaDerecha() != null) && (raiz.getHojaIzquierda() == null)))  {
////					deleteNodoConUnHijo( dato, raiz );
////				}
////				else {
////					deleteNodoConDosHijos( dato, raiz );
////				}
////							
////			}
//// 			else if ( dato < raiz.getValor()){ // recursion si el numero buscado es menor al que esta en el nodo actual se invoca a si mismo con el hijo izq
////				delete ( dato , raiz.getHojaIzquierda() );
////			}
////			else { 
////				delete ( dato , raiz.getHojaDerecha() );// en cambio si es mayor o igual se invoca a si mismo con el hijo der 
////			}
//		}
//	}
//
//	
//	private void deleteNodoSinHijos (int dato, NodoArbol raiz ) {
//		  Arbol aux = new Arbol();
//		  aux.contiene(raiz,dato);
//		  
//		  if ((aux.raiz.getHojaDerecha() == null ) && (aux.raiz.getHojaIzquierda() == null)) {
//			  aux.raiz = null;
//		  }
//		
//	}
//	
//	private void deleteNodoConUnHijo (int dato, NodoArbol raiz ) {
//	    		
//	    	}
//	    	
//	private void deleteNodoConDosHijos (int dato, NodoArbol raiz ) {
//		
//	}
//
//   private Arbol contiene (NodoArbol raiz, int dato) {
//	   Arbol aux = new Arbol();
//	   
//	   if (raiz != null) {
//			if ((raiz.getHojaDerecha().getValor() == dato)|| (raiz.getHojaIzquierda().getValor() == dato)){
//				return this;
//			}
//			else if (raiz.getValor() < dato) {
//				aux.raiz = raiz.getHojaDerecha();
//				aux.contiene(raiz,dato);
//			}
//			else {
//				aux.raiz = raiz.getHojaIzquierda();
//				aux.contiene(raiz,dato);
//			}
//		}
//		return aux;
//   }
//
//
//
//
//
//
//
////		 public int buscarMin() {
////		        abb arbolActual = this;
////		        while( !arbolActual.raiz.hi.esVacio() ) {
////		            arbolActual = arbolActual.raiz.hi;
////		        }
////		        int devuelvo= arbolActual.raiz.dato;
////		        arbolActual.raiz=null;
////		        return devuelvo;
////		    }
////		 
////		    public int buscarMan() {
////		        abb arbolActual = this;
////		        while( !arbolActual.raiz.hd.esVacio() ) {
////		            arbolActual = arbolActual.raiz.hd;
////		        }
////		        int devuelvo= arbolActual.raiz.dato;
////		            arbolActual.raiz=null;
////		        return devuelvo;
////		    }























}
