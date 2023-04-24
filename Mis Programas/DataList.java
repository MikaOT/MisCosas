package classGroup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DataList {
	private ArrayList<Airline> AirlineCollection;
	private ArrayList<Routes> RoutesCollection;
	private ArrayList<Airport> AirportCollection;

	public DataList() {
		super();
		AirlineCollection = new ArrayList();
		RoutesCollection = new ArrayList();
		AirportCollection = new ArrayList();
	}
	
	
	public DataList(ArrayList<Airline> airlineCollection, ArrayList<Routes> routesCollection,
			ArrayList<Airport> airportCollection) {
		super();
		AirlineCollection = airlineCollection;
		RoutesCollection = routesCollection;
		AirportCollection = airportCollection;
	}


	public void TurnOverAirlines() {
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      
	      
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
	        	 A1.setAlias(arrSplit[2]);
	        	 A1.setIATA(arrSplit[3]);
	        	 A1.setICAO(arrSplit[4]);
	        	 A1.setCallsign(arrSplit[5]);
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
	
	public void TurnOverRoutes() {
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      
	      
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\Users\\Casti\\eclipse-workspace\\AirportManagement\\src\\data\\routes.dat");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         String[] arrSplit;
	         Routes R1;
	         while(((linea=br.readLine())!=null)) {
	        	 linea = linea.replace("\\N","0");
	        	 arrSplit = linea.split(","); 
	        	 
	        	 //System.out.println(linea);
	        	 R1 = new Routes();
	        	 R1.setAirline(arrSplit[0]);
	        	 R1.setAirlineID(Integer.parseInt(arrSplit[1]));
	        	 R1.setSourceAirport(arrSplit[2]);
	        	 R1.setSourceAirportID(Integer.parseInt(arrSplit[3]));
	        	 R1.setDestinationAirport(arrSplit[4]);
	        	 R1.setDestinationAirportID(Integer.parseInt(arrSplit[5]));
	        	 if(arrSplit[6].equals("Y")==true) {
	        		 R1.setCodeshare(true);
	        	 }else {
	        		 R1.setCodeshare(false);
	        	 }
	        	 R1.setStops(Integer.parseInt(arrSplit[7]));
	        	 if(arrSplit.length < 9) {
	        		 R1.setEquipment("000");
	        	 }else {
	        		 R1.setEquipment(arrSplit[8]); 
	        	 }
	        	 
	        	 
	        	 
	        	 RoutesCollection.add(R1);
	        	 
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
	
	public void TurnOverAirports() {
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      
	      
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\Users\\Casti\\eclipse-workspace\\AirportManagement\\src\\data\\airports.dat");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         String[] arrSplit;
	         Airport AP1;
	         while(((linea=br.readLine())!=null)) {
	        	 linea = linea.replace(", ","; ");
	        	 linea = linea.replace("Tromsø Airport,","Tromsø Airport");
	        	 linea = linea.replace("\\N","0");
	        	 linea = linea.replace("\"","");
	        	
	        	 
	        	 arrSplit = linea.split(","); 
	        	 AP1 = new Airport();
	        	 
	        	 AP1.setAirportID(Integer.parseInt(arrSplit[0]));
	        	 AP1.setName(arrSplit[1]);
	        	 AP1.setCity(arrSplit[2]);
	        	 AP1.setCountry(arrSplit[3]);
	        	 AP1.setIATA(arrSplit[4]);
	        	 AP1.setICAO(arrSplit[5]);
	        	 AP1.setLatitude(Double.parseDouble(arrSplit[6]));
	        	 AP1.setLongitude(Double.parseDouble(arrSplit[7]));
	        	 AP1.setAltitude(Double.parseDouble(arrSplit[8]));
	        	 AP1.setTimezone(Double.parseDouble(arrSplit[9]));
	        	 AP1.setDST(arrSplit[10].charAt(0));
	        	 AP1.setTz(arrSplit[11]);
	        	 AP1.setTypeAirport(arrSplit[12]);
	        	 AP1.setSource(arrSplit[13]);
	        	 
	        	 //System.out.println(linea);
	        	 
	        	 AirportCollection.add(AP1);
	        	 
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
public void DestinationList() {
		
		System.out.println("Introduce una aerolinea: ");
		Scanner T1 = new Scanner(System.in);
		String Line = T1.nextLine();
		System.out.println("Destinos de aerolineas: ");
		int i = 0;
		int k = 0;
		int airlineCode = 0;
		int airportCode = 0;
		boolean found = false;
		boolean found2 = false;
		boolean foundDestination = false;
		while((i < AirlineCollection.size()) && (found==false)) {
			Airline AUX = AirlineCollection.get(i);
			if(Line.equals(AUX.getName())) {
				airlineCode = AUX.getId();
				found = true;
			}else {
				i++;
			}
			
		}
		
		// AQUI!!
		if(found == true) {
			for(int j = 0; j < RoutesCollection.size() ; j++) {
				Routes AUX = RoutesCollection.get(j);
				if(airlineCode == AUX.getAirlineID()) {
					found2 = false;
					k = 0;
					while((k < AirportCollection.size()) && (found2==false)) {
						Airport AUX2 = AirportCollection.get(k);
						if(AUX.getDestinationAirportID()==(AUX2.getAirportID())) {
							System.out.println(AUX2.getCity());
							found2 = true;
						}else {
							k++;
						}
						
					}
					
					//System.out.println(AUX.getDestinationAirport());
					foundDestination = true;
				}
			}
			
			if(foundDestination == false) {
				System.out.println("Ningun destino asociado a esa aerolinea.");
			}
			
		}else {
			System.out.println("Aerolinea no encontrada.");
		}
	}
	public void IdDestinationList() {
	
	Scanner T1;
	
	
	int Line = 0;
	boolean airlineCorrect = false;
	while(airlineCorrect == false) {
	try {
	T1 = new Scanner(System.in);
	System.out.println("Introduce una id de aerolinea: ");
	Line = T1.nextInt();
	airlineCorrect = true;
	}
	catch(Exception e){
        //e.printStackTrace();
        System.out.println("Error, no ha introducido un codigo de aerolinea numerico.");
        
     }
	}
	
	System.out.println("Destinos de aerolineas: ");
	int i = 0;
	int k = 0;
	int airlineCode = 0;
	int airportCode = 0;
	boolean verify = false;
	boolean found2 = false;
	boolean foundDestination = false;
	while((i < AirlineCollection.size()) && (verify==false)) {
		Airline AUX = AirlineCollection.get(i);
		if(Line==(AUX.getId())) {
			airlineCode = Line;
			verify = true;
		}else {
			i++;
		}
		
	}
	
	// AQUI!!
	if(verify == true) {
		for(int j = 0; j < RoutesCollection.size() ; j++) {
			Routes AUX = RoutesCollection.get(j);
			if(airlineCode == AUX.getAirlineID()) {
				found2 = false;
				k = 0;
				while((k < AirportCollection.size()) && (found2==false)) {
					Airport AUX2 = AirportCollection.get(k);
					if(AUX.getDestinationAirportID()==(AUX2.getAirportID())) {
						System.out.println(AUX2.getCity());
						found2 = true;
					}else {
						k++;
					}
					
				}
				
				//System.out.println(AUX.getDestinationAirport());
				foundDestination = true;
			}
		}
		
		if(foundDestination == false) {
			System.out.println("Ningun destino asociado a esa aerolinea.");
		}
		
	}else {
		System.out.println("Aerolinea no encontrada.");
	}
}
	
	
	
	public void Menu() {
		int option = 0;
		Scanner keyboard;
		
		
		while(option != 4) {
			
			boolean optionCorrect = false;
		while(optionCorrect == false) {	
			try {
				System.out.println("1 Listar aerolineas dado un pais.");
				System.out.println("2 Listar destinos dado un nombre de la aerolinea.");
				System.out.println("3 Listar destinos dado un codigo de la aerolinea.");
				System.out.println("4 para finalizar el programa.");
				
				keyboard = new Scanner(System.in);
				option = keyboard.nextInt();	
				optionCorrect = true;
			}
				catch(Exception e){
			        //e.printStackTrace();
			        System.out.println("Error, no ha introducido un valor numerico.");
			        
			     }
			}
		}
			switch (option) {
			case 1: {
				CountrySearch();
				break;
			} 
			case 2: {
				DestinationList();
				break;
			}
			case 3: {
				IdDestinationList();
				break;
			}
			case 4: {
				System.out.println("Finalizo el programa.");
				break;
			}
			default: 
				System.out.println("Opcion incorrecta.");
			
			
			
			}
		}
	}
	

