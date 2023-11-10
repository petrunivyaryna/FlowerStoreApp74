package ua.ucu.edu.apps.flowerstore;

import lombok.Getter;
import lombok.Setter;
import ua.ucu.edu.apps.flowerstore.delivery.Delivery;
import ua.ucu.edu.apps.flowerstore.payment.Payment;

import java.util.LinkedList;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item: items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void processOrder() {
        if (items.isEmpty()) {
            return;
        }
        double totalPrice = calculateTotalPrice();
        payment.pay(totalPrice);
        delivery.deliver(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        if (items.isEmpty()) {
            return;
        }
        items.remove(item);
    }
    
}
