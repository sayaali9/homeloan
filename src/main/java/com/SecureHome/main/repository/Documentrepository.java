package com.SecureHome.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureHome.main.model.DocumentRequired;

@Repository
public interface Documentrepository extends JpaRepository<DocumentRequired, Integer>{

}

