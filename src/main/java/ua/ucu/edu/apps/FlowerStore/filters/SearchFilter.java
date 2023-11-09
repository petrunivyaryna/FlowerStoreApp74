package ua.ucu.edu.apps.FlowerStore.filters;

import ua.ucu.edu.apps.FlowerStore.Item;

public interface SearchFilter {
    boolean match(Item item);
}