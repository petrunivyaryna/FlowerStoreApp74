package ua.ucu.edu.apps.flowerstore.delivery;

import java.util.LinkedList;

import ua.ucu.edu.apps.flowerstore.Item;

public interface Delivery {
    void deliver(LinkedList<Item> items);
}
