package controlflow;

public class Print1to10WithoutLoop {


    public static void PrintNumber(int a){
        if(a>1){
            PrintNumber(a-1);
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        PrintNumber(10);
    }
}
