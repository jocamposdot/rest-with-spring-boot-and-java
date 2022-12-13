package com.example.erudio.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.example.erudio.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public Person findById(String id) {

		logger.info("Finding one person");

		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Jota");
		person.setLastName("Campos");
		person.setAddressName("Lisbon, Portugal");
		person.setGender("Male");

		return person;

	}
}
