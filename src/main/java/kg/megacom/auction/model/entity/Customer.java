package kg.megacom.auction.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 30)
    private String phone;
}
