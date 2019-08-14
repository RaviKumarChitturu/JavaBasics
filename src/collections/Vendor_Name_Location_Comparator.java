package collections;

import java.util.Comparator;

public class Vendor_Name_Location_Comparator implements Comparator<Vendor>{
	String attribute;

	Vendor_Name_Location_Comparator(String attribute){
		this.attribute=attribute;
		
	}
	@Override
	public int compare(Vendor o1, Vendor o2) {
		switch(attribute){
		case "Vendorlocation": return o1.getVendorlocation().compareTo(o2.getVendorlocation());
		case "Vendorname": return o1.getVendorname().compareTo(o2.getVendorname());
		}
		return 0;
		
	}

}
