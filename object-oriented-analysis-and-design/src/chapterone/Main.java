package chapterone;

import chapterone.enums.Builder;
import chapterone.enums.Type;
import chapterone.enums.Wood;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar result = inventory.search(new Guitar("", 0, Builder.TAYLOR, "814ce", Type.ACOUSTIC, Wood.ROSEWOOD, Wood.SPRUCE));
        System.out.println(result);
    }

    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("SN001", 1499.99, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.MAPLE);
        inventory.addGuitar("SN002", 1299.49, Builder.GIBSON, "Les Paul Standard", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE);
        inventory.addGuitar("SN003", 999.99, Builder.IBANEZ, "RG550", Type.ELECTRIC, Wood.BASSWOOD, Wood.MAPLE);
        inventory.addGuitar("SN004", 1799.00, Builder.TAYLOR, "814ce", Type.ACOUSTIC, Wood.ROSEWOOD, Wood.SPRUCE);
        inventory.addGuitar("SN005", 2199.95, Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.EAST_INDIAN_ROSEWOOD, Wood.SITKA_SPRUCE);
        inventory.addGuitar("SN006", 899.99, Builder.YAMAHA, "FG800", Type.ACOUSTIC, Wood.NATO, Wood.SPRUCE);
        inventory.addGuitar("SN007", 1599.00, Builder.PRS, "Custom 24", Type.ELECTRIC, Wood.MAHOGANY, Wood.FLAME_MAPLE);
        inventory.addGuitar("SN008", 1099.00, Builder.ESP, "Eclipse", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE);
        inventory.addGuitar("SN009", 499.00, Builder.EPIPHONE, "Les Paul Studio", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE);
        inventory.addGuitar("SN010", 699.00, Builder.SEAGULL, "S6 Original", Type.ACOUSTIC, Wood.WILD_CHERRY, Wood.CEDAR);

    }

}
