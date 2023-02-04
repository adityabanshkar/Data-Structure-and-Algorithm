import java.util.ArrayList;

public class keyboardCombination {
    static String globalCode[]={",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> printKeyboardCombination(String str){
        //base condition
        if(str.length()==0){
            ArrayList<String> emptyData=new ArrayList<>();
            emptyData.add("");
            return emptyData;
        }

        char ch=str.charAt(0); //5
        String ss=str.substring(1); //78
        ArrayList<String> storeData=printKeyboardCombination(ss); // faith in this function that will generate result for 78

        String getGlobalCode=globalCode[ch-'0'];  
        ArrayList<String> finalResult=new ArrayList<>();
        for(int i=0;i<getGlobalCode.length();i++){
            char c=getGlobalCode.charAt(i);

            for(String s:storeData){
                finalResult.add(c+s);   //carteson of 5 X 78
            }
        }
        return finalResult;
    }

    public static void main(String[] args) {
        String str="578"; // entering number and corresponding there character will create combination 
        
        ArrayList<String> result=printKeyboardCombination(str);
        System.out.println(result);

    }
    
}
