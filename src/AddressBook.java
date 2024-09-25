import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addresses;
    public AddressBook(){
        addresses = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo b){
        if (b != null){
            addresses.add(b);
        }
    }
    public void removeBuddy(BuddyInfo b){
        if (b != null){
            addresses.remove(b);
        }
    }

    public static void main(String[] args){
        AddressBook a = new AddressBook();
        System.out.println("Address Book");
        BuddyInfo b = new BuddyInfo("Tom","carleton",613);
        a.addBuddy(b);
        a.removeBuddy(b);
        //Andrews Branch
    }
}
