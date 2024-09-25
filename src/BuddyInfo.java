public class BuddyInfo {

    private String name;
    private String address;
    private long phone_number;

    public BuddyInfo(String name, String address, long phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public BuddyInfo() {
        name = "";
        address = "";
        phone_number = 0;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Andrew", "asdf", 1123);
        System.out.println("Hello " + buddy.name + "!");
    }
}
