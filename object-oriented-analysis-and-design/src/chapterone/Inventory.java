package chapterone;

import chapterone.enums.Builder;
import chapterone.enums.Type;
import chapterone.enums.Wood;

import java.util.*;

public class Inventory {

    private final List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, new GuitarSpec(builder, model, type, backWood, topWood));
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        Optional<Guitar> optionalGuitar = guitars
                .stream()
                .filter(guitar -> guitar.getSerialNumber().equals(serialNumber))
                .findFirst();

        return optionalGuitar.orElse(null);
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> searchResult = new ArrayList<>();
        for (Guitar guitar : guitars) {
            GuitarSpec spec = guitar.getSpec();
            if (searchSpec.getBuilder() != spec.getBuilder()) {
                continue;
            }

            String model = searchSpec.getModel();
            if (model != null && !model.isEmpty() && !model.equalsIgnoreCase(spec.getModel())) {
                continue;
            }

            if (searchSpec.getType() != spec.getType()) {
                continue;
            }

            if (searchSpec.getBackWood() != spec.getBackWood()) {
                continue;
            }

            if (searchSpec.getTopWood() != spec.getTopWood()) {
                continue;
            }

            searchResult.add(guitar);
        }

        return searchResult;
    }

}
