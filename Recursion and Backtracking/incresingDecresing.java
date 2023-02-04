import java.util.Scanner;


public class incresingDecresing {

    public static void incDec(int n){
        if(n==0)
            return;
        System.out.println(n);
        incDec(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n=scn.nextInt();

            incDec(n);
        }
    }
    
}
