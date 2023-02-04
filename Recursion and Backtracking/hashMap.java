import java.util.Map;
import java.util.TreeMap;

public class hashMap {
    public static void main(String[] args) {
        //Map<String,Integer> map=new HashMap<>(); //stored in random order due hashmap
        Map<String,Integer> map=new TreeMap<>();   //store elements in sorted order
        map.put("adi",2);
        map.put("sid",4);
        map.put("pri",9);
        map.putIfAbsent("sid", 8);

        for(String s:map.keySet()){
            System.out.println(s);
        }
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getValue());
        }
        
    }
    
}
