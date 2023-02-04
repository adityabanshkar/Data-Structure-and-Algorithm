package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
import java.util.Map;
//import java.util.Set;

public class nonRepetingChar {
    public static void main(String[] args) {
        String str="Hello World";  //output "HeWrd" no repeting char
        //removing spaces
        str=str.replaceAll("\\s", "");
        // uing hashmap
        System.out.println(str);

        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        
        // Map Entry set check count 1 (no repeting char)
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                System.out.print(e.getKey());
            }
            //System.out.println(e.getKey()+"->"+e.getValue());
        }

       
        
    }
}
