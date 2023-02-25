package Heap;
//find k closest no to x
//k=3 and x=7 so i.e find 3 no which are closest to 7

import java.util.PriorityQueue;

public class kClosestNumber {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9};
        int k=3;
        int x=7;

        //logic subtracting all no by 7 and resultant array will be sorted by heap with k size window
        //max heap as smallest no we need which are closest

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Math.abs(b-x) - Math.abs(a -x)); //max-heap
        for (int i : arr) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (pq.size() > 0) {
            System.out.print(pq.poll() + " ");
        }

        // this problem can be solved with 2 pointer approch
        // int l = 0, r = arr.length - 1;
        // while (r - l >= k) {
        //     if (arr[r] - x >= x - arr[l]) {
        //         r--;
        //     } else {
        //         l++;
        //     }
        // }
        // List<Integer> res = new ArrayList<>();
        // for (int i = l; i <= r; i++) res.add(arr[i]);
        // return res;
        
    }
}
