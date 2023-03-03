package Trees;

import java.util.ArrayList;

class printLeftView{

    public void printLeftViewFunction(Node root, ArrayList<Node> list, int level){
        if(root == null) return;
        if(list.get(level)==null){  
            list.add(root); 
        }
        printLeftViewFunction(root.left, list, level+1);
        printLeftViewFunction(root.right, list, level+1);

    }

    public void leftView(Node root){
        ArrayList<Node> list=new ArrayList<>();
        int level=0;
        printLeftViewFunction(root, list, level);

        for(Node n: list){
            System.out.print(n.data+" ");
        }
    }
    public static void main(String[] args) {
        
    }
}