package controlflow;

public class ButterflyPattern {
    public static void main(String[] args) {
        // butterfly patter
        //left up
        for(int i =1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j = 0; j <=i; j++) {
                
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //right up

        // left down
        for(int i =1;i<=4;i++){
            for (int j=i;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // right down
        for(int i =1;i<=4;i++){
            for (int j=i;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
