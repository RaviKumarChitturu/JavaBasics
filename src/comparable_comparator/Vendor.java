package comparable_comparator;

public class Vendor implements Comparable<Vendor> {
	
	int vendorId;
	String vendorName;
	
	Vendor(int vendorId,String vendorName){
		this.vendorId=vendorId;
		this.vendorName=vendorName;
	}
/*	@Override
	public int compareTo(Vendor v) {
		// TODO Auto-generated method stub
		return vendorId-v.vendorId;
	}*/

	@Override
	public int compareTo(Vendor v) {
		// TODO Auto-generated method stub
		return vendorName.compareTo(v.vendorName);
	}
	
	

}
