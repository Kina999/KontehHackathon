package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Desk;

@Repository
public interface DeskRepository extends JpaRepository<Desk, String>{

}
