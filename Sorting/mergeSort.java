package Sorting;

public class mergeSort {
    //merge the subarray
    public static void merge(int[] a, int l, int mid, int r){
        // two array
        int n1=mid-l+1;
        int n2=r-mid;
        int[] N =new int[n1];
        int[] M =new int[n2];
        for(int i=0; i<n1; i++){
            N[i]=a[l+i];
        }
        for(int i=0; i<n2; i++){
            M[i]=a[mid+i +1];
        }

        int i, j, k;
        i = 0;
        j = 0;
        k = l;
        while(i < n1 && j < n2){
            if (N[i] <= M[j]) {
                a[k] = N[i];
                i++;
              } else {
                a[k] = M[j];
                j++;
              }
              k++;
        }

        while (i < n1) {
            a[k] = N[i];
            i++;
            k++;
          }
      
          while (j < n2) {
            a[k] = M[j];
            j++;
            k++;
          }



    }
    //print array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
          System.out.print(arr[i] + " ");
        System.out.println();
      }

    // dividing the array into sub array
    public static void mergeSorting(int[] a, int l, int r){
        if(l < r){
            int mid= (l+r)/2;
            mergeSorting(a, l, mid);
            mergeSorting(a, mid+1, r);

            //merging the array
            merge(a,l,mid,r);

        }
    }


    public static void main(String[] args) {
        int arr[] = { 6, 5, 12, 10, 9, 1 };

        mergeSort ob = new mergeSort();
        ob.mergeSorting(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
