
public class UsoMiArbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arbol arbol = new Arbol();
		
		System.out.println(arbol.getRoot());
		
		
		System.out.println(arbol.hasElem(8));
		
		arbol.insertar(15);
		arbol.insertar(6);
		arbol.insertar(18);
		arbol.insertar(17);
		arbol.insertar(20);
		arbol.insertar(3);
		arbol.insertar(7);
		arbol.insertar(2);
		arbol.insertar(4);
		arbol.insertar(13);
		
		System.out.println(arbol.getRoot());
		System.out.println(arbol.hasElem(10));
		
		System.out.println("PRE ORDER");
		arbol.printPreOrder();
		System.out.println("");
		System.out.println("POST ORDER");
		arbol.printPosOrder();
		System.out.println("");
		System.out.println("IN ORDER");
		arbol.printInOrder();
		
		System.out.println("");
		System.out.println("La altura del arbol es: " + arbol.getHeight());
//		arbol.delete(13);
//		System.out.println("IN ORDER");
//		arbol.printInOrder();
//		Arbol prueba = new arbol;
//		prueba.contiene(raiz, dato)
	}

}
