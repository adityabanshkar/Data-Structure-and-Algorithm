package Sliding_Window;
// Longest Sub String with K unique Character
//Variable size window

import java.util.HashMap;

import java.util.Map;

class longestSubStringKUniqueChar{
    public static void main(String[] args) {
        String str="aabacebebe";
        int k=3;  // k unique character

        char[] a=str.toCharArray();
        Map<Character,Integer> map= new HashMap<>();

        int i=0,j=0;
        int maxLength=Integer.MIN_VALUE;
        //Generalize form of variable size window

        while(j< a.length){
            
            if(map.containsKey(a[j])){
                map.put(a[j],map.get(a[j]) + 1);
            }
            else{
                map.put(a[j],1);
            }
            
            if(map.size()<k){
                j++;
            }
            else if(map.size()==k){
                maxLength=Math.max(maxLength,j-i+1);
               j++;
            }
            else if(map.size()>k ){
                while(map.size()>k ){
                map.put(a[i],map.get(a[i]) -1);
                
                if(map.get(a[i])==0){
                    map.remove(a[i]);
                }
                
                i++;
                
            }
            j++;
            }
        }

        System.out.println("Longest SubString length is : "+maxLength);
        
    }
}