package classGroup;

public class Airline {
	
		private int id;
		private String name;
		private String alias;
		private String IATA;
		private String ICAO;
		private String callsign;
		private String country;
		private boolean active;
		
		
		public Airline() {
			id = 0;
			name = "Unknown";
			country = "Unknown";
			active = false;
		
		}
		public Airline(int id, String name, String country, boolean active) {
			this.id = id;
			this.name = name;
			this.country = country;
			this.active = active;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getAlias() {
			return alias;
		}
		public void setAlias(String alias) {
			this.alias = alias;
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
		public String getCallsign() {
			return callsign;
		}
		public void setCallsign(String callsign) {
			this.callsign = callsign;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		
		
}
