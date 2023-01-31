package com.example.erudio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.erudio.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}	