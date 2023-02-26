package Heap;
//Frequency Sort
//maxheap

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class frequencySort {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,3,3,3,3,6,6,6,9}; // 1-3,2-2,3-5,6-3,9-1
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        //maxHeap
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int key: map.keySet()){
            maxHeap.add(key);
        }
        while(maxHeap.size() >0){
           
            System.out.println(maxHeap.poll());
        }
        
    }
    
}
