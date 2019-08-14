package collections;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;

public class VendorComparator implements Comparator<Vendor>{
   //for Ascending order sorting
	@Override
	public int compare(Vendor o1, Vendor o2) {
		
		return new CompareToBuilder().append(o1.getVendorid(),o2.getVendorid())
				.append(o1.getVendorname(), o2.getVendorname())
				.append(o1.getVendorlocation(), o2.getVendorlocation()).toComparison();
	}

	
	//for Vendorlocation descending order sorting 
/*	@Override
	public int compare(Vendor o1, Vendor o2) {
		
		return new CompareToBuilder().append(o1.getVendorid(),o2.getVendorid())
				.append(o1.getVendorname(), o2.getVendorname())
				.append(o2.getVendorlocation(),o1.getVendorlocation()).toComparison();
	}*/
	

	
	//For Vendorname Ascending order and Vendorlocation descending order sorting 
	/*	@Override
	public int compare(Vendor o1, Vendor o2) {
		
		return new CompareToBuilder()
				.append(o1.getVendorname(), o2.getVendorname())
				.append(o2.getVendorlocation(), o1.getVendorlocation()).toComparison();
	}*/
	
}
