package String;

public class replaceCharWithOccuranace {
    public static void main(String[] args) {
        String str="Opentexttt";
        char[] ch=str.toCharArray();
        char check='t';
        int count=1;
        for(int i=0;i<str.length();i++){
            if(check==str.charAt(i)){
                ch[i]=Integer.toString(count++).charAt(0);    //conversion char= integer->to string -->char                
            }
        }
        System.out.println(new String(ch));

        // 2nd approch if string is big
        int cnt=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==check){
                
            str=str.replaceFirst(String.valueOf(check), String.valueOf(cnt));
            cnt++;
            }
        }
        System.out.println(str);
    }
}
