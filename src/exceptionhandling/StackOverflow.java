package exceptionhandling;

/**    IMP
 *    Throw vs Throws differennt
 *
 *    We can create stack overflow exception
 */
public class StackOverflow {
    public void rec(int i){
        if(i==0){
            return ;
        }else {
            rec(i);
        }

    }
    public static void main(String[] args) {
        StackOverflow obj=new StackOverflow();
        obj.rec(8);
    }

}
