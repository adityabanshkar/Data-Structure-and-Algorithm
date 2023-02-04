import java.util.ArrayList;

public class mazePath {
    public static ArrayList<String> printMazePath(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc)
        {
            ArrayList<String> empty=new ArrayList<>();
            empty.add("");
            return empty;
        }


        ArrayList<String> hpath=new ArrayList<>();
        ArrayList<String> vpath=new ArrayList<>();
        
        if(sc<dc)
            hpath=printMazePath(sr, sc+1, dr, dc);
        if(sr<dr)
            vpath=printMazePath(sr+1, sc, dr, dc);

        ArrayList<String> path=new ArrayList<>();

        for(String ss:hpath){
            path.add("h"+ss);
        }
        for(String ss:vpath){
            path.add("v"+ss);
        }
        return path;
    }
    
    public static void main(String[] args) {
        int r=3;
        int c=3;
        ArrayList<String> path=printMazePath(1,1,r,c);
        System.out.println(path);
    }
}
