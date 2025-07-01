package factorypattern.parser;

import com.fasterxml.jackson.databind.JsonNode;
import factorypattern.domain.Price;
import factorypattern.domain.WholesalePrice;

public class WholesalePriceParser implements PriceParser {
    @Override
    public Price parse(JsonNode payload) {
        WholesalePrice price = new WholesalePrice();

        price.setProductId(payload.get("productId").asText());
        price.setCurrency(payload.get("currency").asText());
        price.setAmount(payload.get("amount").asDouble());
        price.setMinOrderQuantity(payload.get("minOrderQuantity").asInt());
        price.setMaxOrderQuantity(payload.get("maxOrderQuantity").asInt());

        return price;

    }
}
