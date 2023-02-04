//import java.util.ArrayList;
import java.util.Arrays;


public class pairsArray {
    public static void main(String[] args) {
        
        Integer[] IntArray = {1,4,2,3,5};  
        Arrays.sort(IntArray);
        for(Integer i:IntArray){
            System.out.println(i);
        }
        for(int i=0;i<IntArray.length;i++){
            for(int j=0;j<IntArray.length;j++){
                System.out.println(IntArray[i]+" , "+IntArray[j]);
            }
        }




    }
    
}
