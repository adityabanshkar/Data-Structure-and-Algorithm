package Sorting;

public class insertionSort {
    public static int[] insertionSorting(int[] a){
        //Assume first element to be sorted and check with previous value, if greater then shift value to right and at the end store key value 
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;

            while(j>=0 && a[j] > key )
                {
                    a[j+1]=a[j];
                    j--;
                }

            a[j+1]=key;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a={-1,2,1,8,4,3,5,6};
        int[] result=insertionSorting(a);

        for(int i: result){
            System.out.print(i+" ");
        }
    }
}
