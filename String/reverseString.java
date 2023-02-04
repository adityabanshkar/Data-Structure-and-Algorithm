package String;

public class reverseString {
    public static void main(String[] args) {
        String str="hello";
        // 1st approach
        char[] ch= str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
        System.out.print("\n");
        //2nd approach
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
