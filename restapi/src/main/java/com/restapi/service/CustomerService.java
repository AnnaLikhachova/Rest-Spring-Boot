package com.restapi.service;



import java.util.List;

import com.restapi.model.Customer;

/**
 * Service interface for Customer class.
 *
 * @author Anna Likhachova
 * @version 1.0
 */

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
