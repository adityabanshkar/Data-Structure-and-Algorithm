package Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] a={3,4,2,6,4,3,7};
        System.out.println("reverse Array");
        System.out.println("1st Approach (print array in reverse order)");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
        System.out.println("\n2nd Approach (using another array)");
        int[] b=new int[a.length];
        int i=0;
        for(int j=a.length-1;j>=0;j--){
            b[i++]=a[j];
        }
        for(int x:b){
            System.out.print(x);
        }
        System.out.println("\n3rd approach (2 pointer approach)");
        if(a.length<=1)
            return;
        int first=0;
        int last=a.length-1;
        int temp=0;
        while(first<last){
            temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;
        }

        for(int x:a){
            System.out.print(x);
        }

    }
}
