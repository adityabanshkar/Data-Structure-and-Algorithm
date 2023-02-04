public class stringPermutation {
    public static void printPermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String leftstr=str.substring(0,i);
            String rightstr=str.substring(i+1);
            String remaning=leftstr+rightstr;

            printPermutation(remaning, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printPermutation(str,"");
    }
}
