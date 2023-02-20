package Sliding_Window;
//find first negative number in every window size k=3

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class firstNegativeNumber {
    public static void main(String[] args) {
        int[] a={12,-1,-7,8,-15,30,45,23};
        int k=3;

        int i=0;
        int j=0;
        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        while(j<a.length){

            if(a[j]<0)
                q.add(a[j]);             // calculation
            

            if((j-i+1) < k){
                j++;
            }
            else if((j-i+1) == k){
                if(q.isEmpty()){
                    ans.add(0);
                }
                else{
                    ans.add(q.peek()); // ans calculation

                    if(a[i]== q.peek()) // slide the window
                        q.poll();
                    }

                    i++;
                    j++;
                                
            }

        }

        System.out.println("result:"+ans);
    }
    
}
