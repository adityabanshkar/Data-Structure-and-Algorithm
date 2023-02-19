package Sliding_Window;
// Sliding window fixed size window
//problem : find max sum arraY OF WINDOW SIZE K=3

public class maxSumArray {
    public static void main(String[] args) {
        int[] a={2,3,1,8,2,9,1};

        int k=3;
        int sum=0;
        int i=0;
        int j=0;
        int maximum=0;
        while(j < a.length){
            sum=sum+ a[j];

            if((j-i+1) < k){
                j++;
            }
            else if((j-i+1)==k){
                maximum=Math.max(maximum ,sum);
                sum -= a[i];
                i++;
                j++;
            }
        }
        System.out.println("Maximum is :" +maximum);
    }
}
