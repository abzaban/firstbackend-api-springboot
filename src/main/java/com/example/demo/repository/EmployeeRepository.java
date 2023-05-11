package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.PersistenceContext;
import jakarta.persistence.EntityManager;

@Repository
public class EmployeeRepository {

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public void getAll() {
        System.out.println(this.entityManager.toString());
    }
}
