package Sliding_Window;
// find all anagram in string 
//fixed size window

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

public class findAllAnagramString {
    public static void main(String[] args) {
        String str="aabaabba";
        String ptr="aaba";
        
        int k=ptr.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0; i<k ;i++){
            char ch=ptr.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

        }
        int count=map.size();

        int i=0;
        int j=0;
        // List<Integer> ans=new ArrayList<>();
        int ans=0;
        //sliding window
        while(j< str.length()){
            // calculation
            char ch=str.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                    count--;
            }

            if((j-i+1)<k)
                j++;
            
            else if( (j-i+1)==k ){
                //ans calculation
                if(count==0){
                    // ans.add(i);
                    ans++;
                }
                 //sliding window
                 //reverse
                char ch1=str.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1,map.get(ch1)+1);
                    if(map.get(ch1)==1)
                        count++;
                }
                i++;
                j++;

               
            }
        }
        System.out.println("Result:"+ans);
    }
}
