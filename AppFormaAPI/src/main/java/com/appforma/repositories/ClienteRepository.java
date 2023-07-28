package com.appforma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appforma.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}