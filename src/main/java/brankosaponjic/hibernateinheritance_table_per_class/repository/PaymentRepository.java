package brankosaponjic.hibernateinheritance_table_per_class.repository;

import brankosaponjic.hibernateinheritance_table_per_class.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
