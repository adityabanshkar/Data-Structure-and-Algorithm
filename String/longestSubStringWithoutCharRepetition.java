package String;

import java.util.HashMap;
//import java.util.HashSet;
import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
import java.util.Map;
//import java.util.Set;

public class longestSubStringWithoutCharRepetition {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String str="javaconcepto";
        HashMap<Character,Integer> set=new LinkedHashMap<>();
        char[] ch=str.toCharArray();
        int maximum=0;
        for(int i=0;i<ch.length;i++){
            if(!set.containsKey(ch[i])){
                set.put(ch[i],i);
                maximum=Math.max(maximum,set.size());
            }
            else{
                i=set.get(ch[i]);
                set.clear();
            }
        }
        
        System.out.println(maximum);
        for(Map.Entry<Character,Integer> e:set.entrySet()){
            System.out.print(e.getKey());
        }
    }
}
