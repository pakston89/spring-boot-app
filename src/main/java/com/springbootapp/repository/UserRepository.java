package com.springbootapp.repository;

import com.springbootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM users WHERE user_name=:userName", nativeQuery = true)
    User findByUserName(@Param("userName") String userName);
}
