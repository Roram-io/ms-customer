package com.nttdata.customers.controller;

import com.nttdata.customers.model.Customer;
import com.nttdata.customers.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerService customerService;

    @GetMapping
    public Flux<Customer> getCustomers(){
        log.info("Listing all customers: ");
        return null;
    }

    @GetMapping("/{id}")
    public Mono<Customer> getCustomerById(@PathVariable("id") String id){
        log.info("Searching customer with Id "+id);
        return null;
    }

    @PostMapping
    public Mono<Customer> saveCustomer(@RequestBody Customer customer){
        log.info("Inserting a new customer");
        return null;
    }

    @PutMapping
    public Mono<Customer> updateCustomer(@RequestBody Customer customer){
        log.info("Updating the following Id: "+customer.getId());
        return null;
    }

    @DeleteMapping
    public Mono<Void> removeCustomer(@RequestBody Customer customer){
        log.info("Removing the following Customer: "+ customer);
        return null;
    }


}
