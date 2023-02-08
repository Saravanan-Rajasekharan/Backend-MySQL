package com.example.sqlConnection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    // First part in <> : with whom to connect
    // Second part: data type of primary key

    //Write a custom query
    // @Query("SELECT * FROM user_info WHERE id ="2");


}
