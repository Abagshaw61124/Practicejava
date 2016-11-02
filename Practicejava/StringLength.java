import java.util.Scanner;
public class StringLength
{
    public static void main(String[] args)
        {
        String myName=null;
        Scanner sc=new Scanner (System.in);
        System.out.println("please enter your name");
        myName=sc.nextLine();
        System.out.println(myName + " has " + myName.length() + " characters ");
        
        
    }


}