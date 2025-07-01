package factorypattern.domain;

public class RetailPrice extends Price {

    private int discountPercentage;

    private int loyaltyPointsPercentage;

    public RetailPrice() {
    }

    public RetailPrice(
            String productId, String currency, double amount,
            int discountPercentage, int loyaltyPointsPercentage
    ) {
        super(productId, currency, amount);
        this.discountPercentage = discountPercentage;
        this.loyaltyPointsPercentage = loyaltyPointsPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getLoyaltyPointsPercentage() {
        return loyaltyPointsPercentage;
    }

    public void setLoyaltyPointsPercentage(int loyaltyPointsPercentage) {
        this.loyaltyPointsPercentage = loyaltyPointsPercentage;
    }

    @Override
    public String toString() {
        return "RetailPrice[" +
                "productId='" + this.getProductId() + '\'' +
                ", currency='" + this.getCurrency() + '\'' +
                ", amount=" + this.getAmount() +
                ", discountPercentage=" + discountPercentage +
                ", loyaltyPointsPercentage=" + loyaltyPointsPercentage +
                ']';
    }
}
