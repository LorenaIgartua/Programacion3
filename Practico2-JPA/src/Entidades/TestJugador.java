package Entidades;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestJugador {
	private Jugador j1;
	private String[] aux = {"pepe","lorena","martin","nicolas", "agustin"};
	
	@BeforeSuite
	public static void setUpBeforeSuite() throws Exception {
		System.out.println("Arranca el Test Jugador");
	}

	@Test
	public void newJugador()
	{
		j1 = new Jugador();
		assertNotNull(j1);
	}
	
	@Test 
	public void setDNI()
	{
		assertEquals(j1.getDni(), 0);
		j1.setDni(35380361);
	}
	
	@AfterTest
	public void getDNI() {
//		System.out.println(j1.getDni());
		assertEquals(j1.getDni(),35380361);
	}
	
	@Test
	public void setNombre() {
		j1.setNombre("juan");
		assertEquals(j1.getNombre(),"juan");
	}
	
	  @Test(dataProvider = "datosNombre")
	  public void setNombreConDP(int n, Jugador j)
	  {
		  System.out.println(j.getNombre());
		  j1.setNombre(j.getNombre());
		  assertEquals(j1.getNombre(), j.getNombre());
		  j1.setEdad(j.getEdad());
		  assertEquals(j1.getEdad(), j.getEdad());
		  
	  }
	    
	  @DataProvider
	  public Object[][] datosNombre() {
		  System.out.println("dp()");
		  Object [][] ob=new Object[3][2];
		  
		  String csvFile = "C:\\Users\\LORENA IGARTUA\\Desktop\\FACULTAD EXACTAS\\2do AÑO\\2do CUATRIMESTRE\\ARQUITECTURAS WEB\\PRACTICA\\archivo.csv";
		  String line = "";
	       String cvsSplitBy = ",";
	      ArrayList<String> arreglo = new ArrayList();
	      try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	             while ((line = br.readLine()) != null) {
	               String[] items = line.split(cvsSplitBy);
	               arreglo.add(items[0]);
	            }
	       } 
	        catch (IOException e) {
	            e.printStackTrace();
	       }	
		  for(int i=0;i<3;i++){
			  Jugador j2	= 	new Jugador();
			  j2.setNombre(arreglo.get(i));
			  ob[i][0]	=	new Integer(i);
			  ob[i][1]	=	j2;
		}  
		return ob;
	  }

}
