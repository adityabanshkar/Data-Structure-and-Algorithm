package String;

public class reverseWordInString {
    public static void main(String[] args) {
        String str="Hello World";
        // removing space and storing each word in array
        String[] a=str.split(" ");
        System.out.println(a.length);
        String word;
        String resultString="";

        for(int i=0;i<a.length;i++){
            word="";
            for(int j=a[i].length()-1;j>=0;j--)      //travelling from reverse
            {
                word=word+a[i].charAt(j);
            }
            resultString+=word+" ";
        }
        System.out.println("Output : "+resultString);

    }
}
