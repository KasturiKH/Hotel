package com.xworkz.associations.hotel;

import com.xworkz.associations.constants.VendorType;
import com.xworkz.associations.hotel.Hotel;
import com.xworkz.associations.hotel.Vendor;


public class RunnerHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String vendorName="vegetable vendor";
		Vendor vendor=new Vendor(VendorType.VEGETABLE,400,vendorName);
		
		Hotel hotel=new Hotel(vendor);
		hotel.buyVegetables();
		
		
		

	}

}
