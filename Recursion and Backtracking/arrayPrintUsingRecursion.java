public class arrayPrintUsingRecursion {
    public static void printArray(int a[],int n){
       /*  if(i==a.length)
            return;
        System.out.println(a[i]);
        printArray(a, i+1);
       */ 
      if(n==-1)
        return;
    printArray(a,n-1);
    System.out.println(a[n]);

    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,70,80};
        System.out.println(a.length);
        
        int n=a.length-1;
        printArray(a,n);
    }
}
