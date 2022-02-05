package com.springbootapp.repository;

import com.springbootapp.model.Park;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

/**
 * The Park repository interface.
 * @author pause
 */
public interface ParkRepository extends JpaRepository<Park, Integer> {

    @Query(value = "SELECT * FROM parks", nativeQuery = true)
    List<Park> getAll();
}
