package chapterone;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar result = inventory.search(new Guitar("", 0, "Fender", "Stratocaster", "Electric", "Alder", "Maple"));
        System.out.println(result);
    }

    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("SN001", 1499.99, "Fender", "Stratocaster", "Electric", "Alder", "Maple");
        inventory.addGuitar("SN002", 1299.49, "Gibson", "Les Paul Standard", "Electric", "Mahogany", "Maple");
        inventory.addGuitar("SN003", 999.99, "Ibanez", "RG550", "Electric", "Basswood", "Maple");
        inventory.addGuitar("SN004", 1799.00, "Taylor", "814ce", "Acoustic", "Rosewood", "Spruce");
        inventory.addGuitar("SN005", 2199.95, "Martin", "D-28", "Acoustic", "East Indian Rosewood", "Sitka Spruce");
        inventory.addGuitar("SN006", 899.99, "Yamaha", "FG800", "Acoustic", "Nato", "Spruce");
        inventory.addGuitar("SN007", 1599.00, "PRS", "Custom 24", "Electric", "Mahogany", "Flame Maple");
        inventory.addGuitar("SN008", 1099.00, "ESP", "Eclipse", "Electric", "Mahogany", "Maple");
        inventory.addGuitar("SN009", 499.00, "Epiphone", "Les Paul Studio", "Electric", "Mahogany", "Maple");
        inventory.addGuitar("SN010", 699.00, "Seagull", "S6 Original", "Acoustic", "Wild Cherry", "Cedar");

    }

}
