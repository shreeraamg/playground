package chapterone;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Inventory {

    private final List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, String builder, String model,
                          String type, String backWood, String topWood) {
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
            String builder = searchGuitar.getBuilder();
            if (builder != null && !builder.isEmpty() && !builder.equals(guitar.getBuilder())) {
                continue;
            }

            String model = searchGuitar.getModel();
            if (model != null && !model.isEmpty() && !model.equals(guitar.getModel())) {
                continue;
            }

            String type = searchGuitar.getType();
            if (type != null && !type.isEmpty() && !type.equals(guitar.getType())) {
                continue;
            }

            String backWood = searchGuitar.getBackWood();
            if (backWood != null && !backWood.isEmpty() && !backWood.equals(guitar.getBackWood())) {
                continue;
            }

            String topWood = searchGuitar.getTopWood();
            if (topWood != null && !topWood.isEmpty() && !topWood.equals(guitar.getTopWood())) {
                continue;
            }

            return guitar;
        }

        return null;
    }

}
