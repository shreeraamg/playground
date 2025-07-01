package factorypattern.parser;

import com.fasterxml.jackson.databind.JsonNode;
import factorypattern.domain.Price;
import factorypattern.domain.RetailPrice;

public class RetailPriceParser implements PriceParser {
    @Override
    public Price parse(JsonNode payload) {
        RetailPrice price = new RetailPrice();

        price.setProductId(payload.get("productId").asText());
        price.setCurrency(payload.get("currency").asText());
        price.setAmount(payload.get("amount").asDouble());
        price.setDiscountPercentage(payload.get("discountPercentage").asInt());
        price.setLoyaltyPointsPercentage(payload.get("loyaltyPointsPercentage").asInt());

        return price;

    }
}
