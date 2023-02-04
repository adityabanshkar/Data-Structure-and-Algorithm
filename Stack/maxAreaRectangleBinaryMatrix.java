package Stack;

import java.util.Stack;

public class maxAreaRectangleBinaryMatrix {

    // histogram method to find max area of 1D array
    public static int histogramArea(int[] a){
    
        // finding maximum area
        //logic are =length * breadth , finding  NSL and NSR index (Nearest smallest left and right)
        //then width= NSR-NSL -1 or right[]-left[] -1
        //System.out.println("left array:");
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
    
    
       
        // NSR nearest smallest right 
        // reverse the loop and change the array to right array
        //storing 7 in right most sudo value
        // System.out.println("\nright array:");
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
    
           
        //now width calculation = right[i]- left[i] -1
        int[] width=new int[a.length];
        for(int i=0;i<a.length;i++){
            width[i]= right[i]-left[i] -1;
        }
       
    
        //Area =length * breadth =a[i]* width[i]
        int[] area=new int[a.length];
    
        for(int i=0;i<a.length;i++){
            area[i]=a[i]* width[i];
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
       
        return result;
    
    
    }




    public static void main(String[] args) {
        int[][] binaryMatrix={ {0, 1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 0, 0} };
        int m=4,n=4; // m is row and n is column
        int[] a=new int[n];

        //main logic converting 2D array to 1D array  (1X4 ,2X4 ,3X4 and 4X4) finding max area

        for(int i=0;i<m;i++){
            a[i]=binaryMatrix[0][i];
        }

        int max=histogramArea(a);
        
        // for each 1d array storing sum value in a array , if 0 is found then that mean no foundation and storing 0 in array
        
        for(int i=1;i<m;i++){   
            for(int j=0;j<n;j++)
            {
                if(binaryMatrix[i][j]==0){
                    a[j]=0;
                }
                else{
                    a[j]=a[j]+binaryMatrix[i][j];
                }
                          
            }
            
            max=Math.max(max,histogramArea(a));
            
        }
        System.out.println("Maximum area is: "+max);
        
    }
    
}
