import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;


public class Biblioteca {

	public static void main(String[] args) {
		
	       ArbolIndex indice = new ArbolIndex(); 
	       
	       Timer timer = new Timer();
	       timer.start();
	    
	       generarLibreria(indice, "C:\\TPE/dataset1.csv");
	       
	       System.out.println("La generacion de los libros y su indexacion tardo: " + timer.stop() + " nanosegundos");
//	       System.out.println("Las categorias disponibles son las siguientes: ");
//	       indice.printInOrder();
	       
	       String genero = ingreseGenero();
	       timer.start();
	       generarArchivoSalida(indice, genero, "C:\\\\TPE/salida.csv");
	       System.out.println("Generar el archivo del genero solicitado demoro: " + timer.stop() + " nanosegundos");
	       
	    
	      //---------------------------------------------
	        
	}        
	        
			public static void generarLibreria (ArbolIndex indice, String direccion) {
				
				
				String csvFile = direccion;
		        String line = "";
		        String cvsSplitBy = ",";
		        
		        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
		             while ((line = br.readLine()) != null) {
		               String[] items = line.split(cvsSplitBy);    
		               if (items[0]!="Titulo")
		            	   indice.insertar(new Libro (items));
		            }
		        } 
		        catch (IOException e) {
		            e.printStackTrace();
		        }	
			}
			
			public static void generarArchivoSalida (ArbolIndex indice, String genero, String archivo) {
	        	
				MySimpleLinkedList resultado = 	indice.librosDe(genero);
				
//				if (resultado != null) {    //para que imprima en pantalla ---- BORRAR!!!
//					Iterator<Object> it = resultado.iterator();
//					 
//			    	while (it.hasNext() ) {
//			    		System.out.println(it.next().toString());
//			    	}
//				}
		        
		    	BufferedWriter bw = null;
				try {
					File file = new File(archivo);
					if (!file.exists()) {
						file.createNewFile();
					}

					FileWriter fw = new FileWriter(file);
					bw = new BufferedWriter(fw);

					if (resultado != null)  {
						Iterator<Object> it2 = resultado.iterator();
					 
			    	while (it2.hasNext() ) {		    	
							bw.write(it2.next().toString());
							bw.newLine();
						}
					}
				} 
				catch (IOException ioe) {
					ioe.printStackTrace();
				} 
				finally {
					try {
						if (bw != null)
							bw.close();
					} catch (Exception ex) {
						System.out.println("Error cerrando el BufferedWriter" + ex);
					}
				}
	        }
			
			public static String ingreseGenero () {
				String genero = " ";

				BufferedReader entrada = new BufferedReader (new
							InputStreamReader (System.in)); 

					try {
						System.out.println ("Ingrese el genero que desea consultar:");
						genero = new String (entrada.readLine ());
					}
					catch (Exception exc) {
						System.out.println (exc);
					}
						
				System.out.println("Se generara archivo conteniendo libros del genero: " + genero );
				return genero;
			}

}