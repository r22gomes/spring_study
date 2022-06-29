package spring.study.sales.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long orderId;

    @OneToMany
    private final Client client;

    private final LocalDate date;

    @ManyToOne
    private final List<Item> item;

    private final BigDecimal price;

}
