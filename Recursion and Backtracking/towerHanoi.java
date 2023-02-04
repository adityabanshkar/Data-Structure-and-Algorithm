public class towerHanoi {
    public static void printInstrruction(int n,char A,char B,char C){
        if(n==0)
            return;
        printInstrruction(n-1, A, C, B);
        System.out.println(n+"["+" "+A+"-->"+B+"  ]");
        printInstrruction(n-1, C, B, A);

    }
    public static void main(String[] args) {
        int n=3;
        char A='A';
        char B='B';
        char C='C';

        printInstrruction(n,A,B,C);
    }
    
}
