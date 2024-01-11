//program to calculate permutation and combination of user input for n and r
//nPr= n!/(n-r)!        nCr=n!/r!.(n-r)!


import java.util.*;
class Permutation_Combination {
    static int fact(int x){
        if(x==0)
        return 1;
        else
        return (x*fact(x-1));
    }

    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int ch,n,r;
        float npr,ncr;
        System.out.println("Enter your choice: 1 for permutation and 2 for combination");
        ch=ob.nextInt();
        System.out.print("Enter value of 'n' and 'r' [r<n] according to formula ");
        switch(ch){
            case 1:
            System.out.println("nPr=n!/(n-r)!");
            n=ob.nextInt();
            r=ob.nextInt();
            npr=fact(n)/fact(n-r);
            System.out.println("Permutation result: "+npr);
            break;

            case 2:
            System.out.println("nCr=n!/r!.(n-r)!");
            n=ob.nextInt();
            r=ob.nextInt();
            ncr=fact(n)/(fact(r)*fact(n-r));
            System.out.println("Permutation result: "+ncr);
            break;

            default:
            System.out.println("wrong input");
        }
    }
}
