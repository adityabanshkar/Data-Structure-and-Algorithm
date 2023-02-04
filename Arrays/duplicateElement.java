package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//import java.util.Map.Entry;

public class duplicateElement {
    public static void main(String[] args) {
        int[] a={1,2,1,3,4,5,6,4,7,7,8};
        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.println("1st approach Using Hash Map(storing data in hashMap) ");
        for(int i:a){
            if(map.containsKey(i)){
               map.put(i,map.get(i) +1);
            }
            else{
            map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            //System.out.println(e.getKey()+"--->"+e.getValue());
            if(e.getValue()>1)
                {
                    System.out.println("duplicate Element  :"+e.getKey()+" fequency :"+e.getValue());
                }
        }
        
        System.out.println("2nd approach Using Set");
        //array name is x
        int[] x={1,2,1,3,4,5,6,4,7,7,8}; 
        Set<Integer> set=new HashSet<>();
        
        for(int i:x){
            if(set.add(i)!=true)
            {   System.out.println("Duplicate element is :"+i);
            }
        }
    }
}
