package Inheritance_Jan_19_01_2026.MultiLevelInheritance;

import java.time.LocalDate;

class Order {
    int orderId;
    LocalDate orderDate;

    Order(int orderId) {
        this.orderId = orderId;
        this.orderDate = LocalDate.now();
    }

    Order() {}

    public void getOrderStatus() {
        System.out.println("Order Placed");
    }
}

class ShippedOrder extends Order {
    int trackingNumber;

    public ShippedOrder(int orderId) {
        super(orderId);
    }

    public ShippedOrder() {}

    @Override
    public void getOrderStatus() {
        System.out.println("Order Shipped");
    }
}

class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;

    public DeliveredOrder(int orderId) {
        super(orderId);
        deliveryDate = LocalDate.now();
    }

    public DeliveredOrder() {}

    @Override
    public void getOrderStatus() {
        System.out.println("Order Delivered");
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order();
        ShippedOrder shippedOrder = new ShippedOrder();
        DeliveredOrder deliveredOrder = new DeliveredOrder();

        order.getOrderStatus();
        shippedOrder.getOrderStatus();
        deliveredOrder.getOrderStatus();
    }
}
