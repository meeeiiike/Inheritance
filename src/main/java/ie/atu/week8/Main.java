package ie.atu.week8;

public class Main {
    public static void main(String[] args) {
        Customer part1Customer = new Customer("Mike", "ATU", "04493", "123ATU", true);
        System.out.println(part1Customer);

        Customer part2Customer = new Customer();
        part2Customer.setName("Not Mike");
        part2Customer.setAddress("Not ATU");
        part2Customer.setPhone("Not 04493");
        part2Customer.setCustomerNum("Not 123ATU");
        part2Customer.setMailingList(true);
        System.out.println(part2Customer.getName());
        System.out.println(part2Customer.getAddress());
        System.out.println(part2Customer.getPhone());
        System.out.println(part2Customer.getCustomerNum());
        System.out.println(part2Customer.isMailingList());

    }
}