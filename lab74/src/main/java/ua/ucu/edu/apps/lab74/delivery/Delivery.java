package ua.ucu.edu.apps.lab74.delivery;

import java.util.LinkedList;

import ua.ucu.edu.apps.lab74.Item;

public interface Delivery {
    void deliver(LinkedList<Item> items);
}
