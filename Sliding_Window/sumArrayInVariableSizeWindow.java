package Sliding_Window;
// given k as sum 5 and need to find maximum window size that is having sum==k
//variable size window
public class sumArrayInVariableSizeWindow {
    public static void main(String[] args) {
        int[] a={4,1,1,1,2,3,5};
        int k=5;

        // variable size window
        int i=0,j=0;
        int maximum=0;
        int sum=0;

        while(j< a.length){
            //calculation
            sum +=a[j];
            //three condition
            if(sum<k) j++;

            else if(sum==k){
                //calculation
                maximum=Math.max(maximum,(j-i+1));
                j++;
            }
            else if(sum > k){
                while( sum > k){
                    // remove element until sum < k
                    sum=sum - a[i];
                    i++;
                    if(sum==k){
                        //calculation
                        maximum=Math.max(maximum,(j-i+1));
                        }                   
                }
                j++;
            }

        }

        // print maximum length
        System.out.println("Result maximum lenth of window:"+maximum);
        
    }    
}
