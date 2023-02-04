package String;

public class removeSpecialChar {
    public static void main(String[] args) {
        String str="@ad^%it%%*ya07)&*";
        
        str=str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(str);
    }
}
