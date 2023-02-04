import java.util.ArrayList;
import java.util.Iterator;

class listArray{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        System.out.println(list);
        list.set(1,777);
        System.out.println(list);

        //new array list
        ArrayList<Integer> newlist=new ArrayList<>();
        newlist.add(8888);
        newlist.add(55555);

        //merging list
        list.addAll(newlist);
        System.out.println(list);

        for(Integer i:list){
            System.out.println(i);
        }
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}