package Arrays;

public class firstOccuranceAdjacentArray {
    public static void main(String[] args) {
        int[] a={7,6,5,6,5,4,3,4,3,4,3,2,1};
        int index=4; // element first occurance a[5]
        int target=a[index];
        int start=0;
        int diff=0;
        while(start<a.length){
                        
            if(a[start]==target){
            System.out.println("First Occurance of:"+a[start] +" At index:"+start);
            return;
            }
            diff=Math.abs(a[start]- target);
            start=start+diff;

        }
    }
    
}
