package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class reverseLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(5);
        ll.add(3,4);
        //iterating through loop
        int i=0;
        LinkedList<Integer> temp=new LinkedList<>();
        
        while(i<ll.size()){ // logic travelling through ll linked list and storing value in new linked list(temp) at the satrt
            System.out.println(ll.get(i));
            temp.addFirst(ll.get(i));
            i++;
        }
        int j=0;
        System.out.println("Reverse of linked List");
        while(j<temp.size()){
            System.out.println(temp.get(j));
            j++;
        }
    }

}
