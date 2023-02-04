import java.util.HashMap;
import java.util.*;
class Maps{
    public static void main(String[] args) {
        HashMap <String, Integer> empid=new HashMap<>();
        empid.put("adi",1);
        empid.put("sid",3);
        System.out.println(empid);
        System.out.println(empid.size());
        System.out.println(empid.containsValue(4));
        for (Map.Entry<String, Integer> entry : empid.entrySet()) {
            System.out.println("KEY"+entry.getKey());
            System.out.println("value"+entry.getValue());
            
        }
    }
}