package Heap;
//return list of k largest element
//min heap

import java.util.PriorityQueue;

public class returnKLargestElement {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        int k=3;
        //min heap
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        //printing result
        while(minHeap.size()>0){
            System.out.print(" "+minHeap.poll());
            
        }
    }
}
