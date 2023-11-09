package ua.ucu.edu.apps.lab74;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor @Getter @NoArgsConstructor
@Entity
public class Flower {
    @Id
    private int id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
}
