package com.EmployeeConstructor;

public class Location {
		private String Dist;
		private String City;
		private int pincode;
		
		public Location(String dist, String city, int pincode) {
			super();
			Dist = dist;
			City = city;
			this.pincode = pincode;
		}
		public String getDist() {
			return Dist;
		}
		public String getCity() {
			return City;
		}
		public int getPincode() {
			return pincode;
		}
		
		
}
