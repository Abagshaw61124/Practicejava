import java.util.Scanner;
public class StringLength3
{
    public static void main(String[] args)
    {
    String Password1=null;
    String Password2=null;
    Scanner sc=new Scanner (System.in);
    System.out.println("please enter password");
    Password1=sc.nextLine();
    System.out.println("please enter password again");
    Password2=sc.nextLine();
    if (Password1.equals(Password2)) {
      System.out.println("password verified");
    }
    else if (Password1!=Password2){
     System.out.println("please enter password again");
    }
  
    
    }
}   
    