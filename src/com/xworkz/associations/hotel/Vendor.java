package com.xworkz.associations.hotel;

import com.xworkz.associations.constants.VendorType;

public class Vendor {
	private VendorType vendorType;
	private double billPrice;
	private String name;
	
	public Vendor(VendorType vendorType, double billPrice, String name)
	{
		this.billPrice= billPrice;
		this.name= name;
		this.vendorType= vendorType;
		
		
	}
	


	public boolean sell()
	{
		System.out.println("invoked");
		if(this.billPrice > 200)
		{
			return true;
		}
		return false;

	}

	public double getBillPrice() {
		// TODO Auto-generated method stub
		return billPrice;
	}



	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}



	public VendorType getVendorType() {
		// TODO Auto-generated method stub
		return vendorType;
	}
	
}