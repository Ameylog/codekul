package controlflow;

public class IfElseDemo {

    public static void main(String[] args) {
        int i=10;

        // If else
//        if(i>0){
//            System.out.println("i is non zero");
//        }
//        else{
//            System.out.println("I is zero");
//        }


        // nested If else
//        int age=18;
//        String nationality="Indian";
//
//        if(nationality=="Indian"){        // == check content of string
//            if(age>=18){
//                System.out.println("You can give vote");
//            }
//            else{
//                System.out.println("You cannot give vote");
//            }
//        }
//        else{
//            System.out.println("You not Indian");
//        }

        // if else ladder
        int a=100,b=200,c=30,d=40;
        if(a>b && a>c && a>d){
            System.out.println("a is greater");
        } else if (b>c && b>d) {
            System.out.println("b is greater");
        }
        else if (c>d){
            System.out.println("c is greater");
        }
        else{
            System.out.println(" d  is greater");
        }
    }
}
