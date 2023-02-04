public class firstIndexOccurance {
    public static int printFirstIndex(int a[],int i,int d){
        if(i==a.length-1)
            return -1;

        if(a[i]==d){
                return i;
                
            }
        else
              {
                int index=printFirstIndex(a,i+1,d);
                return index;
              }  
        
    }
    public static void main(String[] args) {
        int a[]={10,67,43,34,56,34,12,56,10,43};
        int i=0;
        int d=34;
        System.out.println(printFirstIndex(a,i,d));
    }
    
}
