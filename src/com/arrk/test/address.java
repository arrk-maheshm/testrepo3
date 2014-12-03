package com.arrk.test;

public class address {
	int roadno;
	String streetname;
	String city;
	public address(int roadno, String streetname, String city) {
		super();
		this.roadno = roadno;
		this.streetname = streetname;
		this.city = city;
	}
	
public address()
{
}

public String toString()
{
	

return "address is"+roadno+","+ streetname+","+city;
}



}
