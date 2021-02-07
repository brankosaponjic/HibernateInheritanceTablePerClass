package brankosaponjic.hibernateinheritance_table_per_class.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bank_check")
public class Check extends Payment{

    @Column(name = "check_number")
    private String checkNumber;
}
