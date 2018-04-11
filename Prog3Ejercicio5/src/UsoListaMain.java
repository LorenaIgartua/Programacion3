
public class UsoListaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes, suponiendo que: ");
		
		Lista lista1 = new Lista();
		lista1.insertarInicio(6);
		lista1.insertarInicio(2);
		lista1.insertarInicio(25);
		lista1.insertarInicio(3);
		lista1.insertarInicio(17);
	
		
		Lista lista2 = new Lista();
		lista2.insertarInicio(1);
		lista2.insertarInicio(25);
		lista2.insertarInicio(6);
		lista2.insertarInicio(3);
		
		
		Lista lista3 = new Lista();
		
		lista3 = lista3.armarListaRepetidos(lista1, lista2);
		
		System.out.println("a) las listas están desordenadas y la lista resultante debe quedar ordenada: ");
		
		System.out.println("Elementos de la lista desordenada 1: ");
		lista1.imprimirLista();
		
		System.out.println("Elementos de la lista desordenada 2: ");
		lista2.imprimirLista();
		
		System.out.println("Elementos de la union de las listas desordenadas 1 y 2 (ordenados de menor a mayor): ");
		lista3.imprimirLista();

		
		System.out.println("b) las listas están ordenadas y la lista resultante debe mantenerse ordenada: ");

		Lista lista4 = new Lista();
		lista4.insertarInicio(12);
		lista4.insertarInicio(11);
		lista4.insertarInicio(10);
		lista4.insertarInicio(6);
		lista4.insertarInicio(5);
		lista4.insertarInicio(1);
	
		
		Lista lista5 = new Lista();
		lista5.insertarInicio(11);
		lista5.insertarInicio(7);
		lista5.insertarInicio(6);
		lista5.insertarInicio(5);
		
		
		
		Lista lista6 = new Lista();
		
		lista6 = lista6.armarListaOrdenada(lista4, lista5);
		
		
		System.out.println("Elementos de la lista ordenada 4: ");
		lista4.imprimirLista();
		
		System.out.println("Elementos de la lista ordenada 5: ");
		lista5.imprimirLista();
		
		System.out.println("Elementos de la union de las listas ordenadas 4 y 5 (ordenados de menor a mayor): ");
		lista6.imprimirLista();


	}

}
