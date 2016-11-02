import java.util.Scanner;
public class StringLength5
{
    public static void main(String[] args)
        {
      String FirstName=null;
      String MiddleName=null;
      String LastName=null;
      String Initals=null;
      Scanner sc=new Scanner (System.in);
      System.out.println("please enter first name");
      FirstName=sc.nextLine();
      System.out.println("please enter middle name");
      MiddleName=sc.nextLine();
      System.out.println("please enter last name");
      LastName=sc.nextLine();
      Initals = FirstName.substring(0,1)+ MiddleName.substring(0,1)+LastName.substring(0,1);
      System.out.println(Initals.toUpperCase() );
      
      
     
        
        
    }


}