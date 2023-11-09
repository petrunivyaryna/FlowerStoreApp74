package ua.ucu.edu.apps.flowerstore.filters;

import ua.ucu.edu.apps.flowerstore.Item;

public interface SearchFilter {
    boolean match(Item item);
}