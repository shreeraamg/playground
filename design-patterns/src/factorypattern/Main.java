package factorypattern;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        String json = """
                {
                  "header": {
                    "type": "RETAIL"
                  },
                  "payload": {
                    "productId": "2001",
                    "currency": "USD",
                    "amount": 89.99,
                    "discountPercentage": 15,
                    "loyaltyPointsPercentage": 15
                  }
                }
                """;

        ObjectMapper mapper = new ObjectMapper();
        PriceService priceService = new PriceService(mapper);

        priceService.handleMessage(json);
    }
}
