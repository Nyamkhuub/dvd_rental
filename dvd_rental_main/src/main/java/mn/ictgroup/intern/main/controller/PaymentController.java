package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Payment;
import mn.ictgroup.intern.main.service.PaymentService;

/**
 *
 * Unubayar
 *
 */

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping()
    public List<Payment> getPaymentsByCustomerId(@RequestParam Long customerId) {
        return this.paymentService.getPaymentsByCustomerId(customerId);
    }
}
