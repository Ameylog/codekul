package encapusulation;

/**
 * Encapsulation --> it is mechanism, im which we can wrapping the data members and member function
 *                   of class in a single unit called encapsulation
 * <p>
 * note->>
 * 1. declare the variable as a private
 * 2. declare the method as a public
 * <p>
 * getter and setter are provide the interface for set and get access the private variable
 */
class EncapsulatationDemo {

    private int id;
    private String name;
    private String address;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        EncapsulatationDemo e = new EncapsulatationDemo();
        e.setId(4);
        System.out.println(e.getId());
        e.setName("Hello");
        System.out.println(e.getName());
        e.setAddress("Pune");
        System.out.println(e.getAddress());
    }


}


