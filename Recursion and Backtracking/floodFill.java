public class floodFill {
    public static void printFloodFill(int image[][],int sr, int sc,int color, int newColor){

        if(sr<0 || sr>=image.length || sc<0 || sc>=image[sr].length || image[sr][sc]!=color )
        {return;}
        image[sr][sc]=newColor;
        printFloodFill(image, sr+1, sc, color, newColor);
        printFloodFill(image, sr-1, sc, color, newColor);
        printFloodFill(image, sr, sc+1, color, newColor);
        printFloodFill(image, sr, sc-1, color, newColor);
      
    }
    public static void main(String[] args) {
        int image[][]={{1,0,1,1},
            {0,1,1,1,0},
            {0,0,1,1,0},
            {1,1,1,1,0},
            {1,0,0,0,0}};

        int sr=3;
        int sc=3;
        int newColor=2;
        int color=1;

        if(image[sr][sc]==newColor)
        {
            return;
        }
        printFloodFill(image,sr,sc,color,newColor);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                System.out.print(image[i][j]);
            }
            System.out.println("");
        }
    }
}
