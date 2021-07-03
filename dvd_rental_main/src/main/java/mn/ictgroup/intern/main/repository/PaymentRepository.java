package mn.ictgroup.intern.main.repository;

import mn.ictgroup.intern.main.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    List<Payment> findByPaymentId(Long paymentId);

    Optional<Payment> findPaymentByCustomerId(Long customerId);

    void deleteByPaymentId(Long paymentId);
}
