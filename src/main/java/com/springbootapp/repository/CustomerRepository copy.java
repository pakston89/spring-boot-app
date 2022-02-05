package com.springbootapp.repository;

import com.springbootapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * The Park repository interface.
 * @author pause
 */
public interface ParkRepository extends JpaRepository<Park, Integer> {

    @Query(value = "SELECT * FROM parks", nativeQuery = true)
    List<Park> getAll();

    @Query(value = "SELECT * FROM parks WHERE id=?1", nativeQuery = true)
    Park getById(@Param("id") Integer id);
}