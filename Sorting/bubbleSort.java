package Sorting;

public class bubbleSort {
    public static int[] bubbleSorting(int[] a){
        //storing largest element at the last
        int temp;
        for(int i=0;i<a.length -1;i++){
            for(int j=0; j<a.length-i -1;j++){
                if(a[j] > a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
        return a;
    }
    public static void main(String[] args) {
        int[] a={-1,2,1,8,4,3,5,6};
        int[] result=bubbleSorting(a);

        for(int i: result){
            System.out.print(i+" ");
        }
    }
}
