package Sorting;

import java.util.Arrays;

public class quickSort {
    // partion 
    public static int partition(int[] a, int l, int h){
        int i=l;
        int j=h;
        int pivot=a[i];
        while(i < j){
            while(pivot>= a[i]){
                i++;
            }
            while(pivot <= a[j]){
                j--;
            }
            if(i<j){
                //swap
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

        }
        //swap pivot a[l], a[j]
        int t=a[l];
        a[l]=a[j];
        a[j]=t;
        return j;

    }


    //Quick SOrt
    public static void quickSorting(int[] a, int l, int h){
        if( l < h){
            int j=partition(a,l,h);
            quickSorting(a, l, j-1);
            quickSorting(a, j+1, h);
        }
    }

    public static void main(String[] args) {
        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // call quicksort() on array data
        quickSort.quickSorting(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));

    }
}
