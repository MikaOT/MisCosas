package classGroup;

public class Airport {


private int AirportID;
private String Name;
private String City;
private String Country;
private String IATA;
private String ICAO;
private double Latitude;
private double Longitude;
private double Altitude;
private double Timezone;	
private char DST;	
private String Tz;
private String TypeAirport;
private String Source;

public Airport() {
	super();
	AirportID = 0;
	Name = "";
	City = "";
	Country = "";
	IATA = "";
	ICAO = "";
	Latitude = 0;
	Longitude = 0;
	Altitude = 0;
	Timezone = 0;
	DST = ' ';
	Tz = "";
	TypeAirport = "";
	Source = "";
}

public Airport(int airportID, String name, String city, String country, String iATA, String iCAO, double latitude,
		double longitude, double altitude, double timezone, char dST, String tz, String typeAirport, String source) {
	super();
	AirportID = airportID;
	Name = name;
	City = city;
	Country = country;
	IATA = iATA;
	ICAO = iCAO;
	Latitude = latitude;
	Longitude = longitude;
	Altitude = altitude;
	Timezone = timezone;
	DST = dST;
	Tz = tz;
	TypeAirport = typeAirport;
	Source = source;
}

public int getAirportID() {
	return AirportID;
}

public void setAirportID(int airportID) {
	AirportID = airportID;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getCountry() {
	return Country;
}

public void setCountry(String country) {
	Country = country;
}

public String getIATA() {
	return IATA;
}

public void setIATA(String iATA) {
	IATA = iATA;
}

public String getICAO() {
	return ICAO;
}

public void setICAO(String iCAO) {
	ICAO = iCAO;
}

public double getLatitude() {
	return Latitude;
}

public void setLatitude(double latitude) {
	Latitude = latitude;
}

public double getLongitude() {
	return Longitude;
}

public void setLongitude(double longitude) {
	Longitude = longitude;
}

public double getAltitude() {
	return Altitude;
}

public void setAltitude(double altitude) {
	Altitude = altitude;
}

public double getTimezone() {
	return Timezone;
}

public void setTimezone(double timezone) {
	Timezone = timezone;
}

public char getDST() {
	return DST;
}

public void setDST(char dST) {
	DST = dST;
}

public String getTz() {
	return Tz;
}

public void setTz(String tz) {
	Tz = tz;
}

public String getTypeAirport() {
	return TypeAirport;
}

public void setTypeAirport(String typeAirport) {
	TypeAirport = typeAirport;
}

public String getSource() {
	return Source;
}

public void setSource(String source) {
	Source = source;
}


	

}
