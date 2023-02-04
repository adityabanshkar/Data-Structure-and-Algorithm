package Stack;

import java.util.Scanner;
import java.util.Stack;

public class minElementStackOptimize {
    static Stack<Integer> st=new Stack<>();
    static int minValue=0;
    // optimize code using 2*X- min   
    //using variable minValue , and solving problem with space complexity of O(1)

    public static int min(){
        if(st.empty()){
            return-1;

        }
        else
            return minValue;
    }

    public static void push1(int data){
        if(st.empty()){
            st.push(data);
            minValue=data;
        }
        else{
            if( data >= minValue){
            st.push(data);
            }
            else{        // if(data < minValue)      set a flag means storing some small value(2* data -minValue) which is less then minValue
            st.push( 2*data- minValue);
            minValue=data;
            }
        }

    }

    public static void pop1(){
        if(st.empty()){
            return;
        }
        else{
            if(st.peek() >= minValue){
                st.pop();
            }
            else if(st.peek() < minValue){
                                                // reverse the operation to store previous value in minValue variable
                minValue= minValue*2 -st.peek();
                st.pop();
            
            }
        }
    }

    public static int top1(){
        if(st.empty()){
            return -1;
        }
        if(st.peek()>= minValue){
                return st.peek();
            }
            
        return minValue; // (st.peek() < minValue)
         
               
               
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
            System.out.println("3 TOP:");
            System.out.println("4 Minimum:");
            System.out.println("5 Exit:");
            System.out.println("Enter the choice:");
            choice=sc.nextInt();

            switch(choice){
                case 1: System.out.println("Enter the element to push :");
                        data=sc.nextInt();
                        push1(data);
                        break;

                case 2: pop1();
                        break;

                case 3: System.out.println("\nTop is :"+top1());
                        break;
                case 4: System.out.println("\nMinimum is :"+min());
                        break;
                
                case 5: System.out.println(" Exiting ");
                        flag=false;
                        break;
                

            }


        }
        
    }
    
}
