package spring.study.sales.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long itemId;

    @OneToMany
    private final Order order;

    @OneToMany
    private final Product product;

    private final int quantity;


}
