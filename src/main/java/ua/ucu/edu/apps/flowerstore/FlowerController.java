package ua.ucu.edu.apps.flowerstore;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
    public List<Flower> getFlower() {
        return List.of(new Flower(11.5, 11.5, FlowerColor.RED));
    }
}
