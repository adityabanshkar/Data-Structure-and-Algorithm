package Heap;
//Sort the array which is k nearly sorted array
//this can be solved in nlogn with merge sort but will optimize with heap sort as it is k nearly sorted tc:nlogK
//k=3  {i+k, i-k}

import java.util.PriorityQueue;

public class sortKNearlySortedArray {
    public static void main(String[] args) {
        int[] arr={6,5,3,2,8,10,9};
        int k=3;
        int[] result=new int[arr.length];
        int j=0;

        //sorting element in accending order so min heap
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0; i< arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k){
                result[j++]=minHeap.poll();
            }
        }
        while(!minHeap.isEmpty()){
            result[j++]=minHeap.poll();
        }

        System.out.println("printing result sorted array in nlogk");
        for(int i:result){
            System.out.print(" "+i);
        }

    }
}
