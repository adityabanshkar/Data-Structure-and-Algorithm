package Stack;

import java.util.Stack;

public class stockSpanningOnline {
    
    public static void main(String[] args) {
        
        int[] a={100,80,60,70,60,75,85};

        Stack<Integer> st=new Stack<>();
        int[] S=new int[a.length];
        
        st.push(0); // storing index in stack
        S[0]=1; // starting result will be 1 Nearest greater left
        
        for(int i=1;i<a.length;i++){
            while(!st.empty() && a[st.peek()]<=a[i]){
                //if previous value is small then pop index as they are small
                st.pop();
            }
            S[i]= (st.empty()) ?( i+1 ): (i-st.peek() );

            st.push(i);

        }
        
        for(int i:S){
            System.out.print(i+" ");
        }

    }}