package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.entity.Payment;
import mn.ictgroup.intern.main.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author unubayar
 *
 */
@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getPaymentsByPaymentId(Long paymentId) {
        return this.paymentRepository.findByPaymentId(paymentId);
    }

    public void addNewPayment(Payment payment) {
        Optional<Payment>paymentOptional = paymentRepository.findPaymentByCustomerId(payment.getCustomerId());
        paymentRepository.save(payment);
    }

    public void deletePayment(Long paymentId) {
        paymentRepository.deleteByPaymentId(paymentId);
    }
}
