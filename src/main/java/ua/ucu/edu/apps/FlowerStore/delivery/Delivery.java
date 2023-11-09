package ua.ucu.edu.apps.FlowerStore.delivery;

import java.util.LinkedList;

import ua.ucu.edu.apps.FlowerStore.Item;

public interface Delivery {
    void deliver(LinkedList<Item> items);
}
