public class printAllIndiceInArray {
    public static void printAllIndice(int a[], int i, int d){
        if(i==a.length)
            return;
        if(a[i]==d)
            System.out.println("present at index:"+i);
        printAllIndice(a, i+1, d);
    }
    public static void main(String[] args) {
        int a[]={2,4,3,1,4,6,4,6,4,8};
        int i=0;
        int d=4;
        printAllIndice(a,i,d);

    }
    
}
