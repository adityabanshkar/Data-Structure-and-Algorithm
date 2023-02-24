package Heap;
//find K=3 smallest Element 
//identifiy heap question by k and smallest or largest (Heap)
//k smallest --> max heap
//k largest --> min heap

import java.util.PriorityQueue;

public class kSmallestElement {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        int k=3;
        System.out.println("Array");
        for(int i:arr){System.out.print(" "+i);}
        //find smallest 3rd element of array

        //Max heap
        //using comparator
        // nlogn ---> nlogk
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<arr.length; i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        System.out.println("\nSmallest element at k:"+k+" ---> "+maxHeap.peek());

        
    }
}
