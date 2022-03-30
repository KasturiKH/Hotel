package com.xworkz.associations.hotel;


public class Hotel {

	private String name="Sagar";
	private int since;
	private Vendor vendor;
	private Object vender;
	
	public Hotel(Vendor vendor) {
		this.vendor = vendor;
	}



public void buyVegetables()
{
	System.out.println("invoked");
	
	if (this.name !=null) {
		String hotelName = this.name.toUpperCase();
		System.out.println(hotelName);
		
	}
	
	if (vendor !=null)
	{
		boolean sold= this.vendor.sell();
		if (sold) {
		System.out.println("hotel brings vegetables");
		System.out.println(this.vendor.getBillPrice());
		System.out.println(this.vendor.getName());
		System.out.println(this.vendor.getVendorType());
		} else {
			System.out.println("Hotel dont have vegetables");
		}
	}
}

public void setSince(int since)
{
	this.since = since;
}

public void setName(String name)
{
	this.name=name;
}
}



