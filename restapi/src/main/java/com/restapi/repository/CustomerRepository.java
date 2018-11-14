package com.restapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.model.Customer;

/**
 * Repository interface for Customer class.
 *
 * @author Anna Likhachova
 * @version 1.0
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
