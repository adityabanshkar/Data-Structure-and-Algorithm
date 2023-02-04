import java.util.*;

public class sethash {
    public static void main(String[] args) {
        //Set<Integer> set=new HashSet<>(); elements stored random 
        //Set<Integer> set=new LinkedHashSet<>();   //it maintains the order as it is following link list property
        Set<Integer> set=new TreeSet<>(); //tree set stores the element in sorted order by using binary tree

        set.add(12);
        set.add(88);
        set.add(23);
        set.add(88);
        set.add(99);
        System.out.println(set);
        System.out.println(set.contains(9));
        for(Integer i:set){
            System.out.println(i);
        }
    }
    
}
