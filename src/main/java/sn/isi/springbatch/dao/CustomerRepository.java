package sn.isi.springbatch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.isi.springbatch.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
