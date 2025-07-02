package chapterone;

import chapterone.enums.Builder;
import chapterone.enums.Type;
import chapterone.enums.Wood;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Inventory {

    private final List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        Optional<Guitar> optionalGuitar = guitars
                .stream()
                .filter(guitar -> guitar.getSerialNumber().equals(serialNumber))
                .findFirst();

        return optionalGuitar.orElse(null);
    }

    public Guitar search(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {
            if (searchGuitar.getBuilder() != guitar.getBuilder()) {
                continue;
            }

            String model = searchGuitar.getModel();
            if (model != null && !model.isEmpty() && !model.equalsIgnoreCase(guitar.getModel())) {
                continue;
            }

            if (searchGuitar.getType() != guitar.getType()) {
                continue;
            }

            if (searchGuitar.getBackWood() != guitar.getBackWood()) {
                continue;
            }

            if (searchGuitar.getTopWood() != guitar.getTopWood()) {
                continue;
            }

            return guitar;
        }

        return null;
    }

}
