package core_java.Inheritance.Multilevel;

class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}
class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    String getOrderStatus() {
        return "Order " + orderId + " has been shipped. Tracking Number: " + trackingNumber;
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    String getOrderStatus() {
        return "Order " + orderId + " was delivered on " + deliveryDate + " (Tracking: " + trackingNumber + ")";
    }
}
public class RetailOrderSystem {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-09-10");
        ShippedOrder shipped = new ShippedOrder(102, "2025-09-11", "TRK123456");
        DeliveredOrder delivered = new DeliveredOrder(103, "2025-09-12", "TRK654321", "2025-09-13");
        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
