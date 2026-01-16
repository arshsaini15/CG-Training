package Jan_15_01_2026.Level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    void calculateTotalCost(int quantity) {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.itemCode = 201;
        i.itemName = "Pen";
        i.price = 10;

        i.displayItem();
        i.calculateTotalCost(5);
    }
}
