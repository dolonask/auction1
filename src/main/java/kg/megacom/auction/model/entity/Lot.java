package kg.megacom.auction.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "lots")
public class Lot {

    @Id
    @GeneratedValue
    @Column(name = "lot_id")
    private Long id;

    private String name;

    private Date startDate;
    private Date endDate;

    private double minPrice;
    private double maxPrice;
    private double step;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable =  false)
    private Status status;



}
