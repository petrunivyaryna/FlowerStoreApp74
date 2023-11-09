package ua.ucu.edu.apps.FlowerStore.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/delivery")
public class DeliveryController {

    @GetMapping("/post")
    public String getPost() {
        return "Your order will be delivered by post";
    }

    @GetMapping("/dhd")
    public String getDYD() {
        return "Your order will be delivered by DHD";
    }
    
}

