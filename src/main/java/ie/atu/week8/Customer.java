package ie.atu.week8;

public class Customer extends Person {
    private String customerNum;
    private boolean mailingList;

    public Customer() {
        customerNum = "";
        mailingList = false;
    }

    public Customer(String name, String address, String phone, String customerNum, boolean mailingList) {
        super(name, address, phone);
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "customerNum='" + customerNum + '\'' +
                ", mailingList=" + mailingList;
    }
}
