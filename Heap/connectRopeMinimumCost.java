package Heap;
// find minimum cost after connecting all the rope 
//minimum cost --> minHeap

import java.util.PriorityQueue;

public class connectRopeMinimumCost {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,5};

        //minHeap
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i:arr){
            minHeap.add(i);
        }
        //logic
        int cost=0;
        while(minHeap.size()>=2){
            int first=minHeap.poll();
            int second=minHeap.poll();
            cost += first + second;
            minHeap.add(first + second);
        }
        System.out.println("Minimum Cost is :"+cost);
    }
}
