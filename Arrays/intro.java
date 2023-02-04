package Arrays;

public class intro {
    public static void main(String[] args) {
        int[] x=new int[3];
        System.out.println(x.getClass().getName());
        int[] a=new int[0]; //legal
        System.out.println(a.length);
       // int[] b=new int[-2]; //legal get exception
       // System.out.println(b.length);
        int[] aa=new int[4];
        System.out.println(aa[0]);

        System.out.println("2D array");
        int[][] xx=new int[2][3];
        System.out.println(xx);
        System.out.println(xx[0]);
        System.out.println(xx[0][0]);


        //Declartion
        System.out.println("Checking declaration of array wheater it can take byte short and char value");
        int[] check=new int[5];
        check[0]=1;
        check[1]='a';
        short g=20;
        check[2]=g;
        byte bb=3;
        check[3]=bb;
        check[4]='6'-'0';

        for(int i:check){
            System.out.println(i);
        }
    
    }
    
}
