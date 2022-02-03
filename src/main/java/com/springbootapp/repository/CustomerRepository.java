package com.springbootapp.repository;

import com.springbootapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * The customer repository interface.
 * @author pause
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "SELECT * FROM customers", nativeQuery = true)
    List<Customer> getAll();

    @Query(value = "SELECT * FROM customers WHERE id=?1", nativeQuery = true)
    Customer getById(@Param("id") Integer id);
}