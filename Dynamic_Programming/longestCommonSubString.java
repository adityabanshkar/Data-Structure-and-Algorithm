package Dynamic_Programming;

public class longestCommonSubString {
    public static void main(String[] args) {
        String a="abcdegyu";
        String b="abfcdegy";
        int res=maxLength(a,b);
        System.out.println(res);
    }

    private static int maxLength(String a, String b) {
       int m=a.length();
       int n=b.length();
       int[][] t=new int[m+1][n+1];
       //initialization
       for(int i=0;i<m+1;i++) t[0][i]=0;
       for(int j=0;j<n+1;j++) t[j][0]=0;
       
       //code
       int maxi=Integer.MIN_VALUE;
       for(int i=1;i<m+1;i++){
        for(int j=1;j<n+1;j++){
            if(a.charAt(i-1)==b.charAt(j-1)){
                t[i][j]=t[i-1][j-1] +1;
                maxi=Math.max(maxi,t[i][j]);
            }
            else
                t[i][j]=0;
        }
       }
       return maxi;
    }
}
