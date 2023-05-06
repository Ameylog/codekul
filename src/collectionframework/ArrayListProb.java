package collectionframework;

// list 1->> 1,2,3,4,5
// list 2->> 1,2,3,4,5



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListProb {

    public static void main(String[] args) {

       List<Integer>lst= Arrays.asList(1,2,3,4,5);
       List<Integer>lst1=Arrays.asList(1,2,3,4,5);

        for (int i = 0,j=lst1.size()-1; i < lst.size() ; i++,j--) {
            System.out.println(lst.get(i)*lst1.get(j));
        }
    }
}
