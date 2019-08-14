package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class VendorComparison {

	public static void main(String[] args) {
		ArrayList<Vendor> al=new ArrayList<>();
		al.add(new Vendor(1, "Ravi"));
		al.add(new Vendor(3, "Bhasker"));
		al.add(new Vendor(2, "Patel"));
		Collections.sort(al);
		for (Vendor vendor : al) {
			System.out.println(vendor.vendorId+"  "+vendor.vendorName);
			
		}
	}

}
