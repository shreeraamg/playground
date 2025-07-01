package factorypattern;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import factorypattern.domain.Price;
import factorypattern.domain.PriceType;
import factorypattern.parser.PriceParser;

public class PriceService {

    private final ObjectMapper mapper;

    public PriceService(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public void handleMessage(String jsonMessage) {
        try {
            JsonNode root = mapper.readTree(jsonMessage);
            PriceType priceType = PriceType.valueOf(root.get("header").get("type").asText());
            JsonNode payload = root.get("payload");

            PriceParser parser = PriceParserFactory.getParser(priceType);
            Price price = parser.parse(payload);

            // Do other Processing with Price object.
            System.out.println(price);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
    }

}
