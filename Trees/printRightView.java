package Trees;

import java.util.ArrayList;

class printRightView{

    public void printRightViewFunction(Node root, ArrayList<Node> list, int level){
        if(root == null) return;
        if(list.get(level)==null){  
            list.add(root); 
        }
        //travelling right side first
        printRightViewFunction(root.right, list, level+1);
        printRightViewFunction(root.left, list, level+1);
        

    }

    public void RightView(Node root){
        ArrayList<Node> list=new ArrayList<>();
        int level=0;
        printRightViewFunction(root, list, level);

        for(Node n: list){
            System.out.print(n.data+" ");
        }
    }
    public static void main(String[] args) {
        
    }
}