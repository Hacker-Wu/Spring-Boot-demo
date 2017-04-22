/**
 * 
 */
package com.example.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.beans.Person;
import com.example.repository.PersonRepository;

/**
 * @author hacker
 *
 */
@Service
public class PersonService{
	List<Person> list = new ArrayList<Person>();
	@Autowired
	private PersonRepository personRepository;
	

	 
	
	public Person findById(Integer id) 
	{
		
		return personRepository.findByAge(id);
	}
	@Transactional
	public List<Person> queryAll() 
	{
		
		return personRepository.queryAll();
	}
}
