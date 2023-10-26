package ua.ucu.edu.apps.lab74.filters;

import ua.ucu.edu.apps.lab74.Item;

public interface SearchFilter {
    boolean match(Item item);
}