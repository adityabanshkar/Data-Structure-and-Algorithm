package Stack;

import java.util.Scanner;
import java.util.Stack;

import Arrays.intro;

public class minElementStack {
    static Stack<Integer> st=new Stack<>();
    static Stack<Integer> s=new Stack<>(); // for min element
// 3 method min push pop.

    public static int min(){
        if(s.empty()){
            return -1;
        }
        else
            return s.peek();

    }

    public static void push1(int data){
        if(st.empty()){
            st.push(data);
            s.push(data);
        }
        else{
            st.push(data);
            }
        if(st.peek()<s.peek()){
            s.push(st.peek());
        }

    }
    public static void pop1(){
        if(st.empty()){
            System.out.println("stack is empty");
            return;
        }
        if(st.peek()==s.peek()){
            st.pop();
            s.pop();
           
        }
        else{
            st.pop();
            
        }
        return;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        int data=0;
        boolean flag=true;
        while(flag){
            System.out.print("\n\n");
            System.out.println("1 Push:");
            System.out.println("2 Pop:");
            System.out.println("3 Find Minimum:");
            System.out.println("4 Exit:");
            System.out.println("Enter the choice:");
            choice=sc.nextInt();

            switch(choice){
                case 1: System.out.println("Enter the element to push :");
                        data=sc.nextInt();
                        push1(data);
                        break;
                case 2: pop1();
                        break;


                case 3: System.out.println("\nMinimum is :"+min());
                        break;
                
                case 4: System.out.println(" Exiting ");
                        flag=false;
                        break;
                

            }


        }
        
    }
}
