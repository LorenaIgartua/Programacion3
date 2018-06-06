import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;




public class MiGrafo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
			Grafo biblioteca = new Grafo();       
		       Timer timer = new Timer();
		    
		       generarHistoricoBusqueda(biblioteca, "C:\\TPE/dataset3.csv");
		       
		       
//		       timer.start();
		       biblioteca.obtenerNGenerosSiguientes("humor", 15);
//		       System.out.println("Generar la lista de los N generos mas buscados demoro: " + timer.stop() + " nanosegundos");
		       System.out.println("");
		       
//		       timer.start();
		       biblioteca.obtenerTodosLosGeneros("humor");
		       System.out.println("");
//		       System.out.println("Generar la lista de todos generos buscados demoro: " + timer.stop() + " nanosegundos");
		       System.out.println("");
		       
//		       timer.start();
		       biblioteca.obtenerGenerosAfines("humor");
		       System.out.println("");
//		       System.out.println("Generar la lista de los generos afines demoro: " + timer.stop() + " nanosegundos");
		       System.out.println("");
		       
		       
		       
		    
		      //---------------------------------------------
		        
		}        
		        
				public static void generarHistoricoBusqueda (Grafo biblioteca, String direccion) {
					
					String csvFile = direccion;
			        String line = "";
			        String cvsSplitBy = ",";
			        
			        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			             while ((line = br.readLine()) != null) {
			               String[] busqueda = line.split(cvsSplitBy);    
			               if (busqueda[0]!= "Generos")
			            	   insertar(biblioteca,busqueda);
			            }
			        } 
			        catch (IOException e) {
			            e.printStackTrace();
			        }	
				}
				
				
				public static void insertar (Grafo indice, String [] generos) {
					for (int i = 0; i < generos.length -1; i++) {
						indice.insertarGenero(generos[i], generos[i+1]);
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
			

    
		
	

