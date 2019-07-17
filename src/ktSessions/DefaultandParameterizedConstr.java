package ktSessions;

class DefaultandParameterizedConstr
{
      int var;
      String Name;
      
      public DefaultandParameterizedConstr()
      {
             //code for default one
             //var = 10;
             System.out.println("Default Constructor");
      }
      
      public DefaultandParameterizedConstr(int num,String name)
      {
             //code for parameterized one
            var = num;
            Name=name;
            System.out.println("parameterized  Constructor");
      }
      
      public void disp()
      {
            System.out.println(var+"   "+Name); 
    	  //return var,Name;
      }
      public static void main(String args[])
      {
              DefaultandParameterizedConstr obj1 = new DefaultandParameterizedConstr();
             // DefaultandParameterizedConstr obj2 = new DefaultandParameterizedConstr(10,"KESI");
              obj1.disp();
              //obj2.disp();
             /* DefaultandParameterizedConstr obj3 = new DefaultandParameterizedConstr(23);
              System.out.println("var is: "+obj3.getValue());*/
      }
}