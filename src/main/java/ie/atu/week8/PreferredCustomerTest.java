package ie.atu.week8;

public class PreferredCustomerTest {
    public static void main(String[] args) {
        PreferredCustomer preferredCustomer2 = new PreferredCustomer();

        preferredCustomer2.setName("Johnny Boi");
        preferredCustomer2.setAddress("Galway");
        preferredCustomer2.setPhone("0449393939");
        preferredCustomer2.setCustomerNum("CUSTOMER_1001");
        preferredCustomer2.setMailingList(true);
        preferredCustomer2.addLoyaltyPoints(499); // Accumulate points
        System.out.println(preferredCustomer2);
        preferredCustomer2.addLoyaltyPoints(500); // Accumulate more points
        System.out.println(preferredCustomer2);
        preferredCustomer2.addLoyaltyPoints(500); // Accumulate more points
        System.out.println(preferredCustomer2);
        preferredCustomer2.addLoyaltyPoints(500); // Accumulate more points
        System.out.println(preferredCustomer2);
        preferredCustomer2.addLoyaltyPoints(500); // Accumulate more points
        System.out.println(preferredCustomer2);
        preferredCustomer2.addLoyaltyPoints(500); // Accumulate more points
        System.out.println(preferredCustomer2);
    }
}
