/* A menu driven program that takes a choice from user and performs tasks accordingly.
 * 1- sum of 2 numbers using method definition in the same class.
 * 2- reverse of a string but the method called here is being called from the class 'reverse.java'.
 * 3- random number generated with limit set by user.
 * 4- brings up a calculator.
 * 5- sets up a random password generator.
 * 6- Random array generation and sorting.
 * default- asks the user if module should be run again or exitted
 */


import java.util.*;
import java.util.Random.*;

public class MenuProgramme {
    static int userChoice=1;
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        Random ex= new Random();
        reverse rv= new reverse();
        Calculator clc= new Calculator();
        PasswordGenerator pgen=new PasswordGenerator();
        RandomArray ra=new RandomArray();

        do{
        System.out.println("Enter a choice: ");
        System.out.println("1 for sum of 2 numbers");
        System.out.println("2 for reverse of a string");
        System.out.println("3 for random number generation");
        System.out.println("4 for simple calculator implication");
        System.out.println("5 for password generator");
        System.out.println("6 to generate a random array");

        System.out.println();
        int choice=ob.nextInt();
        System.out.println();

        switch(choice){
            case 1:
            System.out.println("Enter 2 numbers: ");
            int a=ob.nextInt();
            int b=ob.nextInt();
            sum(a,b);
            break;

            case 2:
            System.out.println("Enter a string: ");
            String word=ob.next();
            rv.rever(word);
            break;

            case 3:
            randomm();
            break;

            case 4:
            clc.calc();
            break;

            case 5:
            pgen.main(args);
            break;

            case 6:
            ra.main(args);
            System.out.println();
            break;

            default:
            manage();
            break;
        }
        System.out.println();
    }while(userChoice!=0);

    System.out.println();
    System.out.println();
    System.out.println("Thanks for using this menu driven model. KEEP CODING!!");
    }
    
    static int sum(int x, int y){
        int add= x+y;
        System.out.println(add);
        return add;
    }

    public static void randomm(){
        Scanner ob=new Scanner(System.in);
        Random ex= new Random();
		System.out.print("Enter range of random numbers starting from 1 to __ : ");
        int limit=ob.nextInt();
        System.out.print("How many numbers should be generated?: ");
        int count=ob.nextInt();

        for(int i=1; i<=count; i++)
        {
            int number= ex.nextInt(limit);
            System.out.print(number+" ");
        }
        System.out.println();
	}

    static void manage(){
        Scanner sc=new Scanner(System.in);
        System.out.println("You have entered wrong input.");
        System.out.println("Enter 1 to re-initiate module or 0 to exit");
        userChoice=sc.nextInt();

        int user=0;

        if(userChoice>1){
            do{
            if(userChoice>1){
                System.out.println("You have entered "+userChoice+" as input.");
                System.out.println("Should the system initialise this as 1? Y or N");
                String ch=sc.next();
                ch=ch.toUpperCase();
                if(ch.charAt(0)=='Y'){
                    user=1;
                    userChoice=1;
                }
                else if(ch.charAt(0)=='N'){
                    user=1;
                    userChoice=0;
                }
            }
            }while(user!=1);
    }
}
}
