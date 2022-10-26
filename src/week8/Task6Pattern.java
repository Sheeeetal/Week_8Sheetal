package week8;

import java.util.Scanner;

public class Task6Pattern {
    public static void main(String []args){
        int i,j,n;
        System.out.println("Input Number of n: ");
        Scanner Scan=new Scanner(System.in);
        n= Scan.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
                System.out.println(i);
            System.out.println("");
        }
    }
}
