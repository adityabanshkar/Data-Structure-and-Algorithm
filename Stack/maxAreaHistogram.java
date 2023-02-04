package Stack;

import java.util.Stack;

public class maxAreaHistogram {
    public static void main(String[] args) {
        int[] a={6,2,5,4,5,1,6};  //histogram given
        // finding maximum area
        //logic are =length * breadth , finding  NSL and NSR index (Nearest smallest left and right)
        //then width= NSR-NSL -1 or right[]-left[] -1
        System.out.println("left array:");
        int[] left=new int[a.length];

        // finding index of NSL nearest smaller left
        // storing index on stack
 
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            if(st.empty()){
                left[i]=-1; // sudo value is -1

            }
            if(!st.empty() && a[i]>a[st.peek()]){
                left[i]=st.peek();
            }
            else{
                while(!st.empty() && a[i]<= a[st.peek()]){
                    st.pop();
                }
                if(st.empty()){
                   left[i] =-1;
                }
                else{
                    left[i]=st.peek();
                }

            }
            st.push(i);
        }


        for(int i:left){
            System.out.print(i+" ");
        }

        // NSR nearest smallest right 
        // reverse the loop and change the array to right array
        //storing 7 in right most sudo value
        System.out.println("\nright array:");
        int[] right=new int[a.length];
        
        Stack<Integer> s=new Stack<>();
            for(int i=a.length-1;i>=0;i--){
                if(s.empty()){
                    right[i]=a.length;   // 7 sudo value
    
                }
                if(!s.empty() && a[i]>a[s.peek()]){
                    right[i]=s.peek();
                }
                else{
                    while(!s.empty() && a[i]<= a[s.peek()]){
                        s.pop();
                     }
                    if(s.empty()){
                       right[i] = a.length;
                    }
                    else{
                        right[i]=s.peek();
                    }
    
                }
                s.push(i);
            }
    
            for(int i:right){
                System.out.print(i+" ");
            }
        //now width calculation = right[i]- left[i] -1
        int[] width=new int[a.length];
        for(int i=0;i<a.length;i++){
            width[i]= right[i]-left[i] -1;
        }
        System.out.println("\nWidth:");
        for(int i: width){
            System.out.print(i+" ");
        }

        //Area =length * breadth =a[i]* width[i]
        int[] area=new int[a.length];

        for(int i=0;i<a.length;i++){
            area[i]=a[i]* width[i];
        }
        System.out.println("\nArea:");
        for(int i: area){
            System.out.print(i+" ");
        }

        //finding maximum area using 2 pointer approach
        int i=0;
        int j=area.length-1;
        int max=0;
        int result=0;
        while(i<=j){
            if(area[i]>area[j]){
                max=area[i];
            }
            else{
                max=area[j];
            }
            result=Math.max(max,result);
            i++;
            j--;
        }
        System.out.println("\n Maximum area is :"+result);


    }
}
