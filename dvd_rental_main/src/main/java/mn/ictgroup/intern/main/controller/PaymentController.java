package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.dto.Response;
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
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping()
    public List<Payment> getPaymentsByPaymentId(@RequestParam Long paymentId) {
        return this.paymentService.getPaymentsByPaymentId(paymentId);
    }
    @PostMapping()
    public Payment saveNewPayment(@RequestBody Payment payment) {
        return paymentService.addNewPayment(payment);
    }
    @PutMapping()
    public Response updatePayment(@RequestBody Payment payment){
        return paymentService.editPayment(payment);
    }
    @DeleteMapping()
    public void wrongPayment(@PathVariable("paymentId") Long paymentId){
        paymentService.deletePayment(paymentId);
    }
}
