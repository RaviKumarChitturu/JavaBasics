/*9. Write programs to sort the user-defined class objects based on String value in ascending order
  using Comparator interface and print them in console.

 10. Write programs to sort the user-defined class objects based on String value 
in descending order in 2 possible ways using Comparator interface and print them in console.

11. Write programs to sort the user-defined class objects based on two String attributes in ascending order using Comparator interface and print them in console.
(i.e., order by first String, second string asc).

12. Write programs to sort the user-defined class objects 
based on first String attribute in ascending order & second String attribute in descending order 
using Comparator interface and print them in console.

*/
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Vendor {
	private int Vendorid;
	private String Vendorname;
	private String Vendorlocation;
	
	public int getVendorid() {
		return Vendorid;
	}

	public void setVendorid(int vendorid) {
		Vendorid = vendorid;
	}

	public String getVendorname() {
		return Vendorname;
	}

	public void setVendorname(String vendorname) {
		Vendorname = vendorname;
	}

	public String getVendorlocation() {
		return Vendorlocation;
	}

	public void setVendorlocation(String vendorlocation) {
		Vendorlocation = vendorlocation;
	}

	Vendor(int Vendorid,String Vendorname,String Vendorlocation){	
		this.Vendorid=Vendorid;this.Vendorname=Vendorname;this.Vendorlocation=Vendorlocation;
	}
public String toString(){
	return "VendorData{Vendorid="+Vendorid+" Vendorname="+Vendorname+" Vendorlocation="+Vendorlocation+"}";
	
}
	public static void main(String[] args) {
		ArrayList<Vendor> al=new ArrayList<>();
	al.add(new Vendor(11547, "Superior Parts, Limited", "88 Hagley Park Road, Kingston, JM, Kingston 10"));
	al.add(new Vendor(13367, "Adam Beck", "277 Hagley Park Road, Kingston, JM, Kingston"));
	al.add(new Vendor(13369, "Adam Beck", "44 Hagley Park Road, Kingston, JM, Kingston"));
	al.add(new Vendor(14773, "A & A Vulcanizing", "277 Hagley Park Road, Kingston, JM, Kingston 11"));
	al.add(new Vendor(14774, "Superior Parts", "277 Hagley Park Road, Kingston, JM, Kingston 11"));
	al.add(new Vendor(14774, "Superior Parts", "43 Hagley Park Road, Kingston, JM, Kingston 11"));
	al.add(new Vendor(14775, "A & A Vulcanizing", "144 Hagley Park Road, Kingston, JM, Kingston 11"));
	al.add(new Vendor(17126, "Superior Parts, Limited", "44 Hagley Park Road, Kingston, JM, Kingston 11"));
		
	//Collections.sort(al, Comparator.comparing(Vendor::getVendorid));
	//Collections.sort(al,new Vendor_ID_Comparator());
	//Collections.sort(al, Collections.reverseOrder( new Vendor_ID_Comparator()));
	
	//Collections.sort(al, Comparator.comparing(Vendor::getVendorname));
	//Collections.sort(al,new Vendor_Name_Location_Comparator("Vendorlocation"));
	// Collections.sort(al,new Vendor_Name_Location_Comparator("Vendorlocation")); 
	//Collections.sort(al,new Vendor_Name_Location_Comparator("Vendorlocation").reversed());
	// Collections.sort(al,Collections.reverseOrder(new Vendor_Name_Location_Comparator("Vendorlocation")));
	
	//Collections.sort(al, Comparator.comparing(Vendor::getVendorlocation));
	//Collections.sort(al, Comparator.comparing(Vendor::getVendorname).reversed());
	//Collections.sort(al, new VendorComparator());//for Multiple Attributes sorting
	
	//Collections.sort(al, Comparator.comparing(Vendor::getVendorname).thenComparing(Vendor::getVendorlocation));//for Multiple Attributes sorting
	for (Vendor v : al) {
		//System.out.println(v.Vendorid+" : "+v.Vendorname+" :"+v.Vendorlocation);
		
		
		System.out.println(v);//for toString SOP statement
		
	}

	}


}

