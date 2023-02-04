public class arrayReverseRecusion {
    public static void printArray(int a[], int n){
        if(n==-1)
            return;
        System.out.println(a[n]);
        printArray(a,n-1);
    }
    
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int n=a.length-1;
        printArray(a,n);
    }
}
