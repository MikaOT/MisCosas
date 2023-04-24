package classGroup;

public class Routes {
	private String Airline;
	private int AirlineID;
	private String SourceAirport;
	private int SourceAirportID;
	private String DestinationAirport;
	private int DestinationAirportID;
	private boolean Codeshare;
	private int Stops;
	private String Equipment;
	
	public Routes() {
		
		Airline = "";
		AirlineID = 0;
		SourceAirport = "";
		SourceAirportID = 0;
		DestinationAirport = "";
		DestinationAirportID = 0;
		Codeshare = false;
		Stops = 0;
		Equipment = "";
	}
	
	public Routes(String airline, int airlineID, String sourceAirport, int sourceAirportID, String destinationAirport,
			int destinationAirportID, boolean codeshare, int stops, String equipment) {
		
		Airline = airline;
		AirlineID = airlineID;
		SourceAirport = sourceAirport;
		SourceAirportID = sourceAirportID;
		DestinationAirport = destinationAirport;
		DestinationAirportID = destinationAirportID;
		Codeshare = codeshare;
		Stops = stops;
		Equipment = equipment;
	}

	public String getAirline() {
		return Airline;
	}

	public void setAirline(String airline) {
		Airline = airline;
	}

	public int getAirlineID() {
		return AirlineID;
	}

	public void setAirlineID(int airlineID) {
		AirlineID = airlineID;
	}

	public String getSourceAirport() {
		return SourceAirport;
	}

	public void setSourceAirport(String sourceAirport) {
		SourceAirport = sourceAirport;
	}

	public int getSourceAirportID() {
		return SourceAirportID;
	}

	public void setSourceAirportID(int sourceAirportID) {
		SourceAirportID = sourceAirportID;
	}

	public String getDestinationAirport() {
		return DestinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		DestinationAirport = destinationAirport;
	}

	public int getDestinationAirportID() {
		return DestinationAirportID;
	}

	public void setDestinationAirportID(int destinationAirportID) {
		DestinationAirportID = destinationAirportID;
	}

	public boolean isCodeshare() {
		return Codeshare;
	}

	public void setCodeshare(boolean codeshare) {
		Codeshare = codeshare;
	}

	public int getStops() {
		return Stops;
	}

	public void setStops(int stops) {
		Stops = stops;
	}

	public String getEquipment() {
		return Equipment;
	}

	public void setEquipment(String equipment) {
		Equipment = equipment;
	}
	
	
}
