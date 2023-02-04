package Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] a={1,3,2,5,6,7,9,8};
        int n=9;
        int idealSum=n*(n+1)/2;
        int sum=0;
        for(int i:a){
            sum=sum+i;
        }
        int missingNo=idealSum-sum;
        System.out.println("missing no :"+missingNo);

    }
}
