package Jan_17_2026.InstancevsClass;

public class Prodcut {
    private String productName;
    private int price;

    private static int totalProducts = 0;

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        totalProducts++;
    }

    public static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }
}
