package spring.study.sales.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long clientId;

    private final String name;

    @Column(unique = true, updatable = false)
    private final String username;


}
