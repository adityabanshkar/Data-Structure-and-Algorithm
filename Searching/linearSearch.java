package Searching;

import javax.lang.model.util.ElementScanner6;

public class linearSearch {
    public static void main(String[] args) {
        int[] a={2,5,3,78,5,4,8};
        int flag=0;
        int data=5;
        for(int i=0;i<a.length;i++){
            if(a[i]==data){
                flag=1;
                break;
            }
        }
        if(flag!=0){
            System.out.println("found");
        }
        else{
            System.out.println(" Not found");
        }
    }
}
