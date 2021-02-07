package brankosaponjic.hibernateinheritance_table_per_class;

import brankosaponjic.hibernateinheritance_table_per_class.entity.Check;
import brankosaponjic.hibernateinheritance_table_per_class.entity.CreditCard;
import brankosaponjic.hibernateinheritance_table_per_class.repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateinheritanceTablePerClassApplicationTests {

    @Autowired
    PaymentRepository paymentRepository;

    @Test
    void createPayment() {
        CreditCard cc = new CreditCard();
        cc.setId(111);
        cc.setAmount(500);
        cc.setCardNumber("111555111");
        paymentRepository.save(cc);
    }

    @Test
    void createCheckPayment() {
        Check ch = new Check();
        ch.setId(112);
        ch.setAmount(500);
        ch.setCheckNumber("111555111");
        paymentRepository.save(ch);
    }

}