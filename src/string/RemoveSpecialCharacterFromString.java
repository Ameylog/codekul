package string;

public class RemoveSpecialCharacterFromString {
    public static void main(String[] args) {

        String values="A!eddjiji2#4**)5";
        values=values.replaceAll("[^A-Za-z0-9]","");
        System.out.println(values);
    }
}
