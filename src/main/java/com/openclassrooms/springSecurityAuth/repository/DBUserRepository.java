package com.openclassrooms.springSecurityAuth.repository;

import com.openclassrooms.springSecurityAuth.model.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBUserRepository extends JpaRepository<DBUser, Integer> {
    public DBUser findByUsername(String username);
}