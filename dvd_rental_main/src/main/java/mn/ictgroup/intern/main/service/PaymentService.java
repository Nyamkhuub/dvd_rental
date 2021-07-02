package mn.ictgroup.intern.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Payment;
import mn.ictgroup.intern.main.repository.PaymentRepository;

/**
 *
 * Unubayar
 *
 */
@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepo;

    public List<Payment> getPaymentsByCustomerId(Long customerId) {
        return this.paymentRepo.findByCustomerId(customerId);
    }
}
