package com.example.bola1.repo;

import com.example.bola1.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddEmp  extends JpaRepository<Address,Integer> {
}
