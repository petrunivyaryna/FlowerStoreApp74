package ua.ucu.edu.apps.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/payment")
public class PaymentController {

    @GetMapping("/paypal")
    public String getPayPal() {
        return "PayPal payment processed successfully";
    }

    @GetMapping("/credit-card")
    public String getCreditCard() {
        return "Credit card payment processed successfully";
    }
    
}


