package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sumPairArray {
    
    public static boolean bruteForce(int[] a,int sum){
        int sumCheck=0;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                sumCheck=a[i]+a[j];
                if(sumCheck==sum){
                    return true;
                }

            }
        }
        return false;
    }
    //2 nd approach
    public static boolean sortingApproach(int[]a,int sum){
        Arrays.sort(a);
        int start=0;
        int end=a.length-1;
        int sumCheck=0;
        while(start<=end){
            sumCheck=a[start]+a[end];
            if(sumCheck==sum){
                return true;
            }
            if(sumCheck>sum){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
//3rd approach
    public static boolean setApproach(int[] a,int sum ){
        Set<Integer> set=new HashSet<>();
        for(int i:a){
            if(set.contains(sum-i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a={12,4,7,2,5,6};

        System.out.println("Bruteforce Approach");
        System.out.println(bruteForce(a,10));

        System.out.println("Sorting Approach");
        System.out.println(sortingApproach(a,15));

        System.out.println("Set Approach");
        System.out.println(setApproach(a,8));

    }
}