package Heap;
//find top k frequent element in array
// min heap

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequentElement {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,2,4,9,7,8,8,8,8,8};
        int k=2;

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        int[] res=new int[k];
        PriorityQueue<Integer> minHeap=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int key : map.keySet()){
            minHeap.add(key);
            if(minHeap.size() >k){
                minHeap.poll();
            }
                       
        }
        for(int i=k-1; i>=0;i--){
            res[i]=minHeap.poll();
        }

        for(int i:res){
            System.out.print(" "+i);
        }
        
    }
}
