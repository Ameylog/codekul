package array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * find subArray with the given sum k
 *
 * oputput->  Start index and end index
 */
public class SubArraySumK {
    void subArraySum(int a[],int sum){
        int curSum=0;
        int start=0;
        int end =-1;

        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <a.length; i++) {
            curSum+=a[i];
            if(curSum-sum==0){
                start=0;end=i;
                break;

            }
            if(map.containsKey(curSum)){
                start=map.get(curSum-sum)+1;
                end=i; break;


            }
            map.put(curSum,i);
        }
        if(end==-1){
            System.out.println("Not Found");

        }else{
            System.out.println(start+" "+end);
        }
    }

    public static void main(String[] args) {
        SubArraySumK obj=new SubArraySumK();
        int a[]={10,15,-5,15,-10,5};
        obj.subArraySum(a,5);

    }
}
