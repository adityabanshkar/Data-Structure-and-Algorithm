package Arrays;

public class equilibriumPointArray {
    public static int sum(int[] a,int start,int end){
        int sumVaraible=0;
        for(int i=start;i<end ;i++)
        {
            sumVaraible+=a[i];
        }
        return sumVaraible;
    }
    public static void main(String[] args) {
        int[] a={1,6,7,0,7};
        int n=a.length;
        int lsum,rsum=0;
        for(int i=1;i<n;i++){
            lsum=sum(a,0,i);
            rsum=sum(a,i+1,n);
            if(lsum==rsum){
                System.out.println("Equilibrium point:"+i+" element :"+a[i]);
                return;
            }
        }
    }
    
}
