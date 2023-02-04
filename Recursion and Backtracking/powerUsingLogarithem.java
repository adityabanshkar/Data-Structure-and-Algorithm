public class powerUsingLogarithem{

    public static int powerLogarithm(int x,int n){
        if(n==1)
            return x;
        if(n%2!=0)
            return powerLogarithm(x, n/2)*powerLogarithm(x, n/2)*x;
        else
        return powerLogarithm(x, n/2)*powerLogarithm(x, n/2);
    }

    public static void main(String[] args) {
        int x=2;
        int n=3;
        System.out.println(powerLogarithm(x,n));
    }
}