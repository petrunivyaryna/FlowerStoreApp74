package ua.ucu.edu.apps.flowerstore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor @Getter @NoArgsConstructor
public class Flower {
    private double sepalLength;
    private double price;
    private FlowerColor color;
}
