package ktSessions;

class Boy extends Human {

	public Boy()
	{
		s2="";
	}

	private void disp() {
		System.out.println(""+s1);
		System.out.println(""+s2);		
	}
	
	public static void main(String[] args) {
		Boy obj=new  Boy();
		obj.disp();
	}
}
