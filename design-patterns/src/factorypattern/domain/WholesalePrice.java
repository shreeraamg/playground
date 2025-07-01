package factorypattern.domain;

public class WholesalePrice extends Price {

    private int minOrderQuantity;

    private int maxOrderQuantity;

    public WholesalePrice() {
    }

    public WholesalePrice(
            String productId, String currency, double amount,
            int minOrderQuantity, int maxOrderQuantity
    ) {
        super(productId, currency, amount);
        this.minOrderQuantity = minOrderQuantity;
        this.maxOrderQuantity = maxOrderQuantity;
    }

    public int getMinOrderQuantity() {
        return minOrderQuantity;
    }

    public void setMinOrderQuantity(int minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public int getMaxOrderQuantity() {
        return maxOrderQuantity;
    }

    public void setMaxOrderQuantity(int maxOrderQuantity) {
        this.maxOrderQuantity = maxOrderQuantity;
    }

    @Override
    public String toString() {
        return "RetailPrice[" +
                "productId='" + this.getProductId() + '\'' +
                ", currency='" + this.getCurrency() + '\'' +
                ", amount=" + this.getAmount() +
                ", minOrderQuantity=" + minOrderQuantity +
                ", maxOrderQuantity=" + maxOrderQuantity +
                ']';
    }

}
