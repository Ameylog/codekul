package collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparetorDemo  {
    int id;
    String name;
    String address;

    ComparetorDemo(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;

    }
    public static void main(String[] args) {
        ComparetorDemo obj1=new ComparetorDemo(26,"Pavan","Pune");
        ComparetorDemo obj2=new ComparetorDemo(26,"Amit","Pune");
        ComparetorDemo obj3=new ComparetorDemo(53,"Amol","Pune");


        List<ComparetorDemo> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

//        list.sort(Employee::employeeComparator);

        list.forEach(i->{
            System.out.println(i.id+" "+i.name+" "+i.address);
        });

       Comparator<ComparetorDemo>comparator =new Comparator<ComparetorDemo>() {
         @Override
         public int compare(ComparetorDemo o1, ComparetorDemo o2) {
             if(o1.id==o2.id){
                 return 0;
             } else if (o1.id> o2.id) {
                 return 1;
             }
             else{
                 return 0;
             }

         }
       };
    }
}
