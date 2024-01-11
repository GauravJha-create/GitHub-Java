import java.util.*;
import java.util.Random.*;

public class PasswordGenerator {
    public static void main(String args[]){
        Random ran= new Random();
        Scanner ob=new Scanner(System.in);

        System.out.print("Enter length of password:");
        int len=ob.nextInt();

        String lc="qwertyuiopasdfghjklzxcvbnm";
        String uc="QWERTYUIOPASDFGHJKLZXCVBNM";
        String num="1234567890";
        String charac="~!@#$%^&*()_|.";
        String combination=lc+uc+num+charac;
        String password="";

        for(int i=0;i<len;i++){
            char pass=combination.charAt(ran.nextInt(combination.length()));
            password=password+pass;
        }

        System.out.println("Generated Password: "+password);

        /*
        //to generate a random number
        for(int i=1;i<=5;i++){
            int number=ran.nextInt(50);
            System.out.print(number+" ");
        }
        //to generate a random letter
        System.out.println();
        for(int i=1;i<=5;i++){
            System.out.print(lc.charAt(ran.nextInt(6))+" ");
            }
        }*/
    }
}