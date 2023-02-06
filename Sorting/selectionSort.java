package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void selectionSorting(int[] a){
        for(int i=0;i<a.length;i++){
            int min=i;

            for(int j=i+1;j<a.length;j++){
                if(a[j] < a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }

    }

    public static void main(String[] args) {
    int[] data = { 20, 12, 10, 15, 2 };
    selectionSort ss = new selectionSort();
    ss.selectionSorting(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
    }
    
}
