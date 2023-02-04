import java.util.Arrays;

public class factorial {
    public static int fact(int n,Integer []a){
        if(n<=1)
            return 1;
        
        if(a[n]!=-1){
            return a[n];
        }
        else
           { int result=fact(n-1,a)*n;
            a[n]=result;
            return result;
           }
    }
    
    public static void main(String[] args) {
        int n=6;
        Integer[] a=new Integer[n+1];
        Arrays.fill(a,-1);
        System.out.println(fact(n,a));
    }
}
