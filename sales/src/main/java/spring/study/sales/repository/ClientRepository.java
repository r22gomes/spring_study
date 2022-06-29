package spring.study.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.study.sales.domain.Client;

import java.util.Optional;


public interface ClientRepository extends JpaRepository<Client, Long> {


}
