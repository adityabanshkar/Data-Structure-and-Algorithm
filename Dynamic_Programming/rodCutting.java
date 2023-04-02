package Dynamic_Programming;
class rodCutting{
    public static int cutRod(int price[], int n) {
        //code here
        int[][] dp = new int[n+1][n+1];
        //intialization
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1 ; j < n+1 ; j++){
                if(i==0) dp[0][j]=0;
                if(j==0) dp[i][0]=0;
            }}
        int[] length=new int[n];
        for(int i=0;i<n;i++){
            length[i]=i+1;
        }
        
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1 ; j < n+1 ; j++){
                if(length[i-1] <= j){
                    dp[ i ][ j ] = Math.max( price[ i - 1 ]+dp[ i ][ j - length[i-1]] , dp[ i-1 ][ j ] );
                }
                else dp[ i ][ j ] = dp[ i - 1 ][ j ];
            }
        }
        return dp[n][n];
    }
    public static void main(String[] args) {
        int[] price={1,5,8,9,10,17,17,20};
        int n=price.length;
        System.out.println(cutRod(price,n));
    }
}