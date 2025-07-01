package factorypattern;

import factorypattern.domain.PriceType;
import factorypattern.parser.PriceParser;
import factorypattern.parser.RetailPriceParser;
import factorypattern.parser.WholesalePriceParser;

public class PriceParserFactory {
    public static PriceParser getParser(PriceType type) {
        return switch (type) {
            case RETAIL -> new RetailPriceParser();
            case WHOLESALE -> new WholesalePriceParser();
        };
    }
}
