package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.entity.Actor;
import mn.ictgroup.intern.main.entity.Payment;
import mn.ictgroup.intern.main.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Unubayar
 *
 */
@RestController
@RequestMapping(name = "/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(path = "paymentId")
    public List<Payment> getPaymentsByPaymentId(@RequestParam Long paymentId) {
        return this.paymentService.getPaymentsByPaymentId(paymentId);
    }
    @PostMapping(path = "add")
    public void saveNewPayment(@RequestBody Payment payment) {
        paymentService.addNewPayment(payment);
    }
    @DeleteMapping(path = "{paymentId}")
    public void wrongPayment(@PathVariable("paymentId") Long paymentId){
        paymentService.deletePayment(paymentId);
    }
}
