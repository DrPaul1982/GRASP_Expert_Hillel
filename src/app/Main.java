package app;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setName("Mike");

        Address address = new Address("Lviv", "Shevchenka", "12");
        user.setAddress(address);

        User user2 = new User();
        user2.setName("Alex");
        user2.setAddress(new Address("Kyiv", "Khreshchatyk", "1"));

        User user3 = new User();
        user3.UserFullInfo("Ann", new Address("Odessa", "Deribasivska", "1"));

        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getAddress());

        System.out.println(user2);
        System.out.println(user2.getName());
        System.out.println(user2.getAddress());

        System.out.println(user3);
    }
}
