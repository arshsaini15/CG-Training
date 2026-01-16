package Jan_15_01_2026.Level1;


class Phone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Phone m = new Phone();
        m.brand = "Samsung";
        m.model = "Galaxy S21";
        m.price = 55000;

        m.displayDetails();
    }
}
