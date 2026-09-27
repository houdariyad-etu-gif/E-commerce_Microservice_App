package net.riyad.customerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Entity : veut dire que la class Customer correspond a une class dans la base de donnees
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;



}
