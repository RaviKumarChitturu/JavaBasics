package ktSessions;

class Example3
{
      public int var;
      public Example3(int num)
      {
             var=num;
      }
      public int getValue()
      {
              return var;
      }
      public static void main(String args[])
      {
              Example3 myobj = new Example3(1);
              System.out.println("value of var is: "+myobj.getValue());
      }
}