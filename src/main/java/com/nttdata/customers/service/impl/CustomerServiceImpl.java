package com.nttdata.customers.service.impl;

import com.nttdata.customers.model.Customer;
import com.nttdata.customers.repository.CustomerRepository;
import com.nttdata.customers.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Flux<Customer> listCustomers() {
        return null;
    }

    @Override
    public Mono<Customer> listById() {
        return null;
    }

    @Override
    public Mono<Customer> removeCustomer() {
        return null;
    }

    @Override
    public Mono<Customer> saveCustomer() {
        return null;
    }

    @Override
    public Mono<Customer> updateCustomer() {
        return null;
    }
}
