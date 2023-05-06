package string;

/***
 * StringBuffer :- are syncronizes    (used in multithreading) // slower
 *
 *StringBuilder:- are not syncronized    (not used in multithreading) // faster
 *
 * StringBuffer vs StringBuilder
 */


public class StringbufferDemo {

    public static void main(String[] args) {

        String str = "Mumbai";
        StringBuffer st = new StringBuffer(str);
        st.append("Pune");
        System.out.println(st);
//        System.out.println(new StringBuffer(" ").capacity());
//        System.out.println(st.reverse());
        System.out.println(st.insert(2,'e'));
        System.out.println(st.replace(2,3,"i"));

        System.out.println(st.capacity());

        System.out.println(st.delete(1,3));
        System.out.println(st.deleteCharAt(0));

        System.out.println();
        StringBuilder stringBuilder =new StringBuilder("Amey");
        stringBuilder.append(" Shende");
        System.out.println(stringBuilder.indexOf("Shende"));
        System.out.println(stringBuilder.equals("Shende"));
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.reverse());

        System.out.println(stringBuilder);




    }

}
