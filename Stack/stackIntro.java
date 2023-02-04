package Stack;

import java.util.Stack;

public class stackIntro {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(20);
        st.push(40);
        st.push(34);
        st.push(39);
        System.out.println(st.peek());
        System.out.println("loachion of 34 at index:"+st.search(34));
        while(!st.empty()){
            System.out.println(st.pop());
        }
        
    }
}
