package ie.atu.week8;

public class PreferredCustomer extends Customer{
    private int loyaltyPoints;
    private int discountLevel;

    public PreferredCustomer() {
        loyaltyPoints = 0;
        discountLevel = 0;
    }

    public PreferredCustomer(String name, String address, String phone, String customerNum, boolean mailingList, int loyaltyPoints, int discountLevel) {
        super(name, address, phone, customerNum, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints += loyaltyPoints;
        if(this.loyaltyPoints>=500&&this.loyaltyPoints<1000)
        {
            this.discountLevel = 5;
        } else if (this.loyaltyPoints>=1000&&this.loyaltyPoints<1500) {
            this.discountLevel = 6;
        }else if (this.loyaltyPoints>=1500&&this.loyaltyPoints<2000) {
            this.discountLevel = 7;
        }else if (this.loyaltyPoints>=2000){
            this.discountLevel = 10;
        } else {
            this.discountLevel = 0;
        }
    }

    public int getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(int discountLevel) {
        this.discountLevel=discountLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPreferredCustomer{" +
                "loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '%';
    }
}