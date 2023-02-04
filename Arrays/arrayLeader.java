package Arrays;

public class arrayLeader {
    public static void main(String[] args) {
        int[] a={1,15,3,9,5,2};
        int flag;
        System.out.println("Array:");
        for(int i:a){
            System.out.print(i +" ");
        }

        System.out.println("\nleader in Array");
        // 1st approach
        /*
        for(int i=0;i<a.length;i++){
            flag=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    flag=1;
                }
                }
                if(flag==0){
                    System.out.println(a[i]);
                }
        }*/

       int max=a[a.length-1];
       System.out.println(max);
       
        for(int j=a.length-1;j>0;j--){
            if(a[j-1]>=max){
               max= a[j-1];
               System.out.println(max);
            }
        }
    }
}
