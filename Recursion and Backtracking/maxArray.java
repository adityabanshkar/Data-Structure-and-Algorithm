public class maxArray {
    public static int printMaxArray(int a[],int i){
        if(i>a.length-1)
            return 0;
        int result=printMaxArray(a, i+1);
        if(result>a[i])
            return result;
        else
            return a[i];    
    }
    public static void main(String[] args) {
        int a[]={200,33,12,44,23,1200};
        int i=0;
        System.out.println(printMaxArray(a,i));
    }
    
}
