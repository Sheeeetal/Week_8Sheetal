package week8;

public class Task14 {

        public static void main(String[] args)
        {
            int num = 7;
            int m =1;
            int n;

            do {
                n = 1;
                do {
                    System.out.println("");
                }
                while (++n <=num -m + 1);
                n = 1;
                do {
                    System.out.println("*");
                }
                while (++n <= m*2 -1);
                System.out.println();
            }
            while (++m <= num);
            n=1;
            do {
                System.out.println("");
            }
            while (++n <= m*2-1);
            System.out.println();
        }
    }


