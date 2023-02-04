import java.util.ArrayList;

public class stringSubSequence{

    public static ArrayList<String> printSubSequence(String str){
        if(str.length()==0){
            //to print empty espace 000
            ArrayList<String> empty=new ArrayList<>();
            empty.add("");
            return empty;

        }
        char ch=str.charAt(0); // a
        String ss=str.substring(1); //bc
        ArrayList<String> StoreFaith=printSubSequence(ss);

        //now we have BC sub sequence by faith
        //now we will add a and not add a
        //new Array list to store result
        ArrayList<String> storeResult=new ArrayList<>();
        for(String i:StoreFaith){
            storeResult.add(""+i);
            } 

        for(String i:StoreFaith){
            storeResult.add(ch+i);
        } 
           
        
        return storeResult;
    }
    
    public static void main(String[] args) {
        String str="ABC";
        ArrayList<String> finalResult=printSubSequence(str);
        
        System.out.println(finalResult);
                
    }
}