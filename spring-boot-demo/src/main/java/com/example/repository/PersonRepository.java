package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.beans.Person;


public interface PersonRepository extends CrudRepository<Person, Integer>{
	List<Person> person = new ArrayList<Person>();
	public Person findByAge(Integer i);
	@Modifying
	@Query("select p from Person p")
	public List<Person> queryAll();
	

}
