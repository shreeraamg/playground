package factorypattern.domain;

public abstract class Price {

    private String productId;
    private String currency;
    private double amount;

    public Price() {
    }

    public Price(String productId, String currency, double amount) {
        this.productId = productId;
        this.currency = currency;
        this.amount = amount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Price{" +
                "productId='" + productId + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
