package com.springbootapp.repository;

import com.springbootapp.model.Park;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ParkRepository extends JpaRepository<Park, Integer> {

    @Query(value = "SELECT * FROM parks", nativeQuery = true)
    List<Park> getAll();

    @Query(value = "SELECT * FROM parks WHERE customer_idp=:customerIdp", nativeQuery = true)
    List<Park> getParksByCustomerIdp(@Param("customerIdp") Long customerIdp);


}
