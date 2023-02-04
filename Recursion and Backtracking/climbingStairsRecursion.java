public class climbingStairsRecursion {
    public static void climbrecursion(int n,String path){
        if(n<0)
        {
            return;
        }
        
        if(n==0)
        {
            System.out.println("[ "+path+" ]");
            return;
        }
        climbrecursion(n-1, path+"1");
        climbrecursion(n-2, path+"2");
        climbrecursion(n-3, path+"3");
                
    }

    public static void main(String[] args) {
        int n=3;
        climbrecursion(n,"");
    }
}