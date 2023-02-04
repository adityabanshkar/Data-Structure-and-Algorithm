package String;

import java.util.HashMap;
import java.util.Map;

public class longestRepetingSubstring {
    public static int calculateMaxLength(String s,int k){
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        
        //int maximum=0;
        int result=0;
        for(int right=0; right <s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right), 0) + 1); // frequency of each char
            while((right - left +1) - maxfreq(map) > k){            // conditon sliding window 
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left), 0) - 1);     //moving window ahead
                left++;
            }
            result=Math.max(result, right-left +1);

        }
        return result;

    }
    public static int maxfreq(HashMap<Character,Integer> map){
        int mx=0;
        for (Map.Entry<Character,Integer> e: map.entrySet()){
            mx=Math.max(mx,e.getValue());
        }
        return mx;
    }
    
    public static void main(String[] args) {
        String s="ABPLL";
        int k=1;
        System.out.println(calculateMaxLength(s,k));
        
    }
}
