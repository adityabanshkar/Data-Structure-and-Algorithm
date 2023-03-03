package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderBT {
    void printLevelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr= q.poll();
            //for printing
            if(curr ==null){
                if(q.isEmpty()) return;
                q.add(null);
                System.out.println();
                continue;
            }

            System.out.print(curr.data+" ");
            if(curr.left!= null){
                q.add(curr.left);
            }
            if(curr.right!= null){
                q.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
