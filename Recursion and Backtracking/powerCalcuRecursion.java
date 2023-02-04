public class powerCalcuRecursion{

    public static int power(int x,int n){
        if(n==1)
            return x;
        
        return power(x,n-1) *x;
        

    } 


    public static void main(String[] args) {
        //without recusion
        int x=3;
        int n=4;
        int temp=1;
        for(int i=0;i<n;i++){
            temp=x*temp;
        }
        System.out.println(temp);
        // with recursion
        System.out.println("Using recursion  ");

        System.out.println(power(x,n));

    }
}