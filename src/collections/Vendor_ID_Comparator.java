package collections;

import java.util.Comparator;

public class Vendor_ID_Comparator implements Comparator<Vendor> {

	@Override
	public int compare(Vendor o1, Vendor o2) {
		
		
		return o1.getVendorid()-o2.getVendorid();
		//return o2.getVendorid()-o1.getVendorid(); to sort in descending
	}

}
