package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Payment;
import mn.ictgroup.intern.main.exception.ApiRequestException;
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

    public Payment addNewPayment(Payment payment) {
        Optional<Payment>paymentOptional = paymentRepository.findPaymentByCustomerId(payment.getCustomerId());
        if(paymentOptional.isPresent()){
            throw new ApiRequestException("FirstName taken");
        }
       return paymentRepository.save(payment);
    }

    public Response editPayment(Payment payment) {
        Optional<Payment>paymentOptional = paymentRepository.findPaymentByPaymentId(payment.getPaymentId());
        Payment newPayment = paymentOptional.get();
        if(paymentOptional.isPresent()){
            newPayment.setPaymentId(payment.getPaymentId());
            newPayment.setCustomerId(payment.getCustomerId());
            newPayment.setStaffId(payment.getStaffId());
            newPayment.setRentalId(payment.getRentalId());
            newPayment.setAmount(payment.getAmount());
            newPayment.setPaymentDate(payment.getPaymentDate());
            throw new ApiRequestException("amjltgui");
        }
        paymentRepository.save(newPayment);
        return new Response ("amjilttai", "success");
    }

    public void deletePayment(Long paymentId) {
        boolean exists = paymentRepository.existsById(paymentId);
        if (!exists){
            throw new ApiRequestException(paymentId + "doesn't delete");
        }
        paymentRepository.deleteByPaymentId(paymentId);
    }

}
