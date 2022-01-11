package com.nttdata.customers.service;

import com.nttdata.customers.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Flux<Customer> listCustomers();

    Mono<Customer> listById();

    Mono<Customer> removeCustomer();

    Mono<Customer> saveCustomer();

    Mono<Customer> updateCustomer();
}
