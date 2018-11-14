package com.restapi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple Bean object that represents Customer.
 *
 * @author Anna Likhachova
 * @version 1.0
 */

@Entity
@Table(name = "customers", schema = "rest")
@Getter
@Setter
@ToString
public class Customer extends CustomerEntity {

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

}
