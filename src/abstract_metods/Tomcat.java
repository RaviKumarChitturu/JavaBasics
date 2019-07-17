package abstract_metods;

public class Tomcat extends Server{
	
	public Tomcat(String name)
	{ 
		super(name); 
	} 

	@Override public boolean start() 
	{ 
		System.out.println( this.name + " started successfully"); 
		return true; 
	}


}
