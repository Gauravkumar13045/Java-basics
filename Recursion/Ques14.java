package Recursion;

public class Ques14 {
    public static void main(String[] args) {
        fabo(0,1,10);
    }
    public static void fabo(int i, int g, int fab) {
        if(fab==0){
            return;
        }
        System.out.println(i);
        fabo(g, i+g, fab - 1);


    }
}
