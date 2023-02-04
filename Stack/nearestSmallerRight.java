package Stack;

import java.util.Stack;

public class nearestSmallerRight {
    public static void main(String[] args) {
        int[] a={4,5,2,10,8};
            int[] res=new int[a.length];
    
           Stack<Integer> st=new Stack<>();
            for(int i=a.length-1;i>=0;i--){
                if(st.empty()){
                    res[i]=-1;
    
                }
                if(!st.empty() && a[i]>st.peek()){
                    res[i]=st.peek();
                }
                else{
                    while(!st.empty() && a[i]<= st.peek()){
                        st.pop();
                     }
                    if(st.empty()){
                       res[i] =-1;
                    }
                    else{
                        res[i]=st.peek();
                    }
    
                }
                st.push(a[i]);
            }
    
            for(int i:res){
                System.out.print(i+" ");
            }

    }
    
}
