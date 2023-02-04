import java.util.Arrays;

public class febonaci {
    public static Integer ar[];
    public static Integer febo(Integer n,Integer []ar)
    {
        //ar=new Integer[n+1];
        

        if(n<=1)
            return n;
        if(ar[n]!=-1)
            return ar[n];
        
        else{    
         int result= febo(n-1,ar)+febo(n-2,ar);
         ar[n]=result;
         return result;
        }

    }

    public static void main(String[] args) {
        int n=17;
        Integer ar[]=new Integer[n+1];
        Arrays.fill(ar,-1);
        System.out.println(febo(n,ar));
    }
    
}
