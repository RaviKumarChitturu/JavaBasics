package comparable_comparator;

import java.util.Comparator;

public class BillIdComparator implements Comparator<Bill>{

	@Override
	public int compare(Bill o1, Bill o2) {
		// TODO Auto-generated method stub
		return o1.billId-o2.billId;
	}
	
}
