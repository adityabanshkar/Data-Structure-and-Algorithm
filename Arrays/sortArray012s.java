package Arrays;

public class sortArray012s {
    public static void swap(int a[],int i,int j){
        int temp=0;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        
    }
    public static void main(String[] args) {
        System.out.println("Sorting array 0's, 1's and 2's ");
        int[] a={0,1,1,0,2,2,1,0,2};
        System.out.println("array :");
        for(int i:a){
            System.out.print(i+" ");
        }
        //logic O(n) time complexity
        int low=0;
        int mid=0;
        int high=a.length-1;
        int swap=0;

        while(mid<=high){
            switch(a[mid]){
                case 0: swap(a,low,mid);
                        low++;
                        mid++;
                        break;
                case 1: mid++;
                        break;
                case 2: swap(a,mid,high);
                        high--;
                        break;

            }

            
        }
        System.out.println("\narray after sort:");
            for(int i:a){
                System.out.print(i+" ");
            }
    }
    
}
