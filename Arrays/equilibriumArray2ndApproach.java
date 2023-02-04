package Arrays;

public class equilibriumArray2ndApproach {
    public static void main(String[] args) {
        int[] a={1,6,7,0,7};
        int sum_so_far=0;
        int sum=0;
        for(int i:a){
            sum+=i;     //sum of array calculation
        }
        //System.out.println(sum);
        for(int i=0;i<a.length;i++){
            sum= sum - a[i];

            if(sum==sum_so_far){
                System.out.println("Equilibrium point :"+i+" element :"+a[i]);
                return;
            }
            sum_so_far= sum_so_far + a[i];

        }
    }
    
}
