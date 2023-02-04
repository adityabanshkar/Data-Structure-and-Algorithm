package Stack;

import java.util.Stack;

public class nearestGreaterRight {
    public static void main(String[] args) {
        //int[] a={1,3,0,0,1,2,4};
        int [] a={1,3,2,4};
        int[] result=new int[a.length];
        Stack<Integer> st=new Stack<>();
        
        for(int i=a.length-1;i>=0;i--){
            if(st.empty()){              // if it is empty return -1
                result[i]=-1;
            }
            if(!st.empty() && a[i]<st.peek()){
                result[i]=st.peek();            //if right element is greater then return that element 
            }
            else{                                       //else pop element till you find greater 
                while(!st.empty() && a[i]>st.peek()){
                    st.pop();                           
                }
                if(st.empty()){    // if stack becomes empty while poping means no greater elements at right
                    result[i]=-1;
                }
                else{
                    // size is not zero found greater element
                    result[i]=st.peek();
                }
            }
            st.push(a[i]);   //push to stack
        }

        System.out.println("Result:"); //printing the result
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
