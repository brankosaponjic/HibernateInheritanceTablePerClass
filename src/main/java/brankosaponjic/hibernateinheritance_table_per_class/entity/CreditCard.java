package brankosaponjic.hibernateinheritance_table_per_class.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "card")
public class CreditCard extends Payment{

    @Column(name = "card_number")
    private String cardNumber;
}