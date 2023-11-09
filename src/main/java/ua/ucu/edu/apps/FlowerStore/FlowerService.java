package ua.ucu.edu.apps.FlowerStore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    public FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepositoryCurrent) {
        this.flowerRepository = flowerRepositoryCurrent;
    }
    public List<Flower> getFlower() {
		return flowerRepository.findAll();
    }

    public void add(Flower flower) {
        flowerRepository.save(flower);
    }
}
