package Trees;
import java.util.*;

class TreeNode{
    
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value=value;
    }
    
}

class Pair{
    
    int vertical;
    TreeNode node;
    Pair(int vertical,TreeNode node){
        this.vertical=vertical;
        this.node=node;
    }
    
}


public class topView
{
 public static void main(String[] args) {
     
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     
     root.left.right.left = new TreeNode(6);
     
     root.right.right=new TreeNode(7);
     
     
     
     
  System.out.println(topViewfunction(root));
  
  
  
 }
 
 public static ArrayList<Integer> topViewfunction(TreeNode root){
     
     
     ArrayList<Integer> ans = new ArrayList<>();
     
     TreeMap<Integer,Integer> map = new TreeMap<>();
     
     Queue<Pair> q = new LinkedList<>();
     
     q.offer(new Pair(0,root));
     
     if(root==null){
         return ans;
     }
     
     while(!q.isEmpty()){
         
         Pair temp = q.poll();
         int vertical = temp.vertical;
         TreeNode node = temp.node;
         
         if(!map.containsKey(vertical)){
             map.put(vertical,node.value);
         }
         
         if(node.left!=null){
             q.offer(new Pair(vertical-1,node.left));
         }
         
         if(node.right!=null){
             q.offer(new Pair(vertical+1,node.right));
         }
         
     }
     
     for(int nodeValue : map.values()){
         ans.add(nodeValue);
     }
     
     
     return ans;
     
     
 }
 
 
}