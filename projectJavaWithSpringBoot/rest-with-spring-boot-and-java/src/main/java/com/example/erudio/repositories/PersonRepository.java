package com.example.erudio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.erudio.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}