package Sliding_Window;
// Longest non repeating charater
// variable size window

import java.util.HashMap;
import java.util.Map;

public class longestStringWithoutRepeatChar {
    public static void main(String[] args) {
        String str="pwwktew";
        char[] a=str.toCharArray();

        Map<Character,Integer> map=new HashMap<>();
        int i=0,j=0;
        int maxLength=Integer.MIN_VALUE;
        while(j < a.length){
            if(map.containsKey(a[j])){
                map.put(a[j],map.get(a[j]) + 1);
            }
            else{
                map.put(a[j],1);
            }

            if(map.size() == (j-i+1)){
                maxLength=Math.max(maxLength, (j-i+1));
                j++;
            }
            else if(map.size() <(j-i+1)){ // repeting charater exist need to slide window
                while(map.size() <(j-i+1)){
                    map.put(a[i],map.get(a[i])-1); // count reduce
                    if(map.get(a[i])==0){
                        map.remove(a[i]);
                    }
                    i++;
                }
                j++;

            }

        }
        System.out.println("Result longest no repeting charater is:"+maxLength);
    }
}
