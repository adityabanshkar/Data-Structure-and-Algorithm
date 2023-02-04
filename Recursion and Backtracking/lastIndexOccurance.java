public class lastIndexOccurance {  public static int printLastIndex(int a[],int i,int d){
    if(i==a.length)
        return -1;

    int index=printLastIndex(a,i+1,d);
    if(index==-1){
        if(a[i]==d)
            return i;
        else
            return -1;
    }
    else
        return index;
            
    
}
public static void main(String[] args) {
    int a[]={10,67,43,34,56,34,12,56,10,43};
    int i=0;
    int d=1;
    System.out.println(printLastIndex(a,i,d));
}
    
}
