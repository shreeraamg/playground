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

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
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
            if (searchSpec.equals(spec)) {
                searchResult.add(guitar);
            }
        }

        return searchResult;
    }

}
