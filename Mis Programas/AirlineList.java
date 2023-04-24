package classGroup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class AirlineList {
	private ArrayList<Airline> AirlineCollection;

	public AirlineList(ArrayList<Airline> airlineCollection) {
		super();
		AirlineCollection = airlineCollection;
	}
	public AirlineList() {
		super();
		AirlineCollection = new ArrayList();
	}
	
	public void TurnOver() {
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      int contador = 0;
	      
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\Users\\Casti\\eclipse-workspace\\AirportManagement\\src\\data\\airlines.dat");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         String[] arrSplit;
	         Airline A1;
	         while(((linea=br.readLine())!=null)) {
	        	 linea = linea.replace("\"","");
	        	 arrSplit = linea.split(","); 
	        	 
	        	 //System.out.println(linea);
	        	 A1 = new Airline();
	        	 A1.setId(Integer.parseInt(arrSplit[0]));
	        	 A1.setName(arrSplit[1]);
	        	 A1.setCountry(arrSplit[6]);
	        	 if(arrSplit[7].equals("Y")== true) {
	        		 A1.setActive(true);
	        	 }else {
	        		 
	        		 A1.setActive(false);
	        	 }
	        	 AirlineCollection.add(A1);
	        	 
	         }
	           
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	}
	public void CountrySearch() {
		
		System.out.println("Introduce un pais: ");
		Scanner T1 = new Scanner(System.in);
		String Line = T1.nextLine();
		System.out.println("Aerolineas del pais: ");
		for(int i = 0; i < AirlineCollection.size() ; i++) {
			Airline AUX = AirlineCollection.get(i);
			if(Line.equals(AUX.getCountry())) {
				System.out.println(AUX.getName());
			}
		}
	}
	
	
}
