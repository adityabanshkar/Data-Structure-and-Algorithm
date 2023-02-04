package String;

public class removeSpaces {
    public static void main(String[] args) {
        String str=" He  L  L O";
        System.out.println(str);
        str=str.replaceAll("\\s", "");
        System.out.println(str); // \\s is used for whitespace
    }
}
