package factorypattern.parser;

import com.fasterxml.jackson.databind.JsonNode;
import factorypattern.domain.Price;

public interface PriceParser {
    Price parse(JsonNode payload);
}
