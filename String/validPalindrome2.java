package String;

public class validPalindrome2 {
    public static boolean checkPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return helperPalindrome(s,i+1,j) ||helperPalindrome(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean helperPalindrome(String s,int firstIdex,int lastIndex){
        int i=firstIdex;
        int j=lastIndex;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    
    }

    public static void main(String[] args) {
        String s="abca";
        System.out.println(checkPalindrome(s));
    }
}
