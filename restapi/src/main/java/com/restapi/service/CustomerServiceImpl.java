package com.restapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.Customer;
import com.restapi.repository.CustomerRepository;

import java.util.List;

/**
 * Implementation of CustomerService interface.
 *
 * @author Anna Likhachova
 * @version 1.0
 */


@Service
public class CustomerServiceImpl implements CustomerService {
	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) {
    	logger.info("CustomerServiceImpl getById {}", id);
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
    	logger.info("CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
    	logger.info("CustomerServiceImpl delete {}", id);
        customerRepository.delete(id);
    }

    @Override
    public List<Customer> getAll() {
    	logger.info("CustomerServiceImpl getAll");
        return customerRepository.findAll();
    }
}
