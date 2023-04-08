package Dynamic_Programming;

public class palindromePartioning {
    public static void main(String[] args) {
        String s="gitif";
        System.out.println(solve(s,0,s.length()-1));
    }
    public static int solve(String s, int i, int j){
        // base condition
        
        if(isPalindrome(s,i,j)==true || i>=j )
            return 0;
        
        int ans=Integer.MAX_VALUE;
        for(int k=i; k<=j-1;k++){
            int tempans= 1+ solve(s,i,k) +solve(s,k+1,j);
            ans=Math.min(ans, tempans);
        }
        return ans;
    }
    public static boolean isPalindrome(String s, int i,int j){
      
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
