package spring.study.sales.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.study.sales.domain.Client;
import spring.study.sales.repository.ClientRepository;

@Service
public class ClientService {


    private final ClientRepository repository;

    public ClientService(final ClientRepository repository) {
        this.repository = repository;
    }

    public void saveClient(final Client client) {
        //save
    }

    public void validate(final Client client) {

    }

}
