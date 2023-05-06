package basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Room {

    public String  fan;

    public String tv;
    public void show(int i){
        System.out.println(i);
    }

    public static void main(String[] args)  throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {
//
//        //1. Using new keyward create object
        Room room = new Room();
        room.show(5);

        //2. clone method to create object
//        Room r1 =(Room) room.clone();
//          r1.show(3);

        //3. creating object using reflection
         // Room room1 = Room.class.newInstance();
//          room1.show(4);
////
//         //  use constructior from java.lang.reflect create object

//           Constructor<Room> roomConstructor = Room.class.getConstructor();




    }
}
