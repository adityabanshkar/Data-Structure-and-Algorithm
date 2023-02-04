package String;

//import java.util.HashMap;
//import java.util.HashSet;
import java.util.LinkedHashSet;
//import java.util.Map;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {
        String str="akagbba";
        Set<Character> ch = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            ch.add(str.charAt(i));
        }
        for(char i:ch){
            System.out.println(i);
        }

    }
}
