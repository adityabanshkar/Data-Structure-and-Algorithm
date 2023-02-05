package Searching;

public class binarySearch {
    public static int binaryS(int[] a, int find){
        int low=0;
        int high=a.length-1;
        int index=-1;
        
        int mid=0;

        while(low <= high){
            mid=(low + high)/2;

            if( a[mid] == find ){
                index=mid;
                break;
            }
            else if( find < a[mid]){
                high=mid-1;
            }
            else if( find > a[mid]){
                    low=mid +1;
                }
            
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a={2,4,5,7,8,12,34};
        int find=4;
        int i=binaryS(a, find);
        if(i>=0)
            System.out.println("Element found at :"+i);
        else
            System.out.println("Not Found");
        
    }
}
