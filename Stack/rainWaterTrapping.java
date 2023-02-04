package Stack;
//find maximum rain water trapping

public class rainWaterTrapping{
    public static void main(String[] args) {
        int[] a={3,0,0,2,0,4}; // building height 

        //login finding MIN( max left , max right ) - a[i] => height 
        // height X 1=> area of indivual building 
        // will sum up all area

        // storing maximum left in array
        int[] maxl=new int[a.length];
        maxl[0]=a[0];

        for(int i=1;i<a.length;i++){

            maxl[i]=Math.max(maxl[i-1],a[i]);

        }

        // storing maximum right in array
        int[] maxr=new int[a.length];
        maxr[a.length-1]=a[a.length-1];

        for(int i=a.length-2;i>=0;i--){

            maxr[i]=Math.max(maxr[i+1],a[i]);

        }

        int area=0;
        // Area claculation
        for( int i=0; i<a.length; i++ ){
            area=area+ Math.min( maxl[i], maxr[i] )-a[i];       // area of each building (min height - a[i])
        }
        System.out.println("Area :"+area);
    }
}