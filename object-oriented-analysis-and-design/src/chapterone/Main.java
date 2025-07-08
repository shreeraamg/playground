package chapterone;

import chapterone.enums.Builder;
import chapterone.enums.Type;
import chapterone.enums.Wood;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        List<Guitar> guitars = inventory.search(new GuitarSpec(Builder.TAYLOR, "814ce", Type.ACOUSTIC, Wood.ROSEWOOD, Wood.SPRUCE, 12));
        for (Guitar guitar : guitars) {
            System.out.println(guitar);
        }
    }

    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("SN001", 1499.99, new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.MAPLE, 8));
        inventory.addGuitar("SN002", 1299.49, new GuitarSpec(Builder.GIBSON, "Les Paul Standard", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 12));
        inventory.addGuitar("SN003", 999.99, new GuitarSpec(Builder.IBANEZ, "RG550", Type.ELECTRIC, Wood.BASSWOOD, Wood.MAPLE, 12));
        inventory.addGuitar("SN004", 1799.00, new GuitarSpec(Builder.TAYLOR, "814ce", Type.ACOUSTIC, Wood.ROSEWOOD, Wood.SPRUCE, 12));
        inventory.addGuitar("SN005", 2199.95, new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.EAST_INDIAN_ROSEWOOD, Wood.SITKA_SPRUCE, 6));
        inventory.addGuitar("SN006", 899.99, new GuitarSpec(Builder.YAMAHA, "FG800", Type.ACOUSTIC, Wood.NATO, Wood.SPRUCE, 8));
        inventory.addGuitar("SN007", 1599.00, new GuitarSpec(Builder.PRS, "Custom 24", Type.ELECTRIC, Wood.MAHOGANY, Wood.FLAME_MAPLE, 8));
        inventory.addGuitar("SN008", 1099.00, new GuitarSpec(Builder.ESP, "Eclipse", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 6));
        inventory.addGuitar("SN009", 499.00, new GuitarSpec(Builder.EPIPHONE, "Les Paul Studio", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 12));
        inventory.addGuitar("SN010", 699.00, new GuitarSpec(Builder.SEAGULL, "S6 Original", Type.ACOUSTIC, Wood.WILD_CHERRY, Wood.CEDAR, 8));
        inventory.addGuitar("SN011", 1749.00, new GuitarSpec(Builder.TAYLOR, "814ce", Type.ACOUSTIC, Wood.ROSEWOOD, Wood.SPRUCE, 12));

    }

}
