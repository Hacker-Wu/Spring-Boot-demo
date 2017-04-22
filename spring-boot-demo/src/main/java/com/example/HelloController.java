/**
 * 
 */
package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Person;
import com.example.service.PersonService;

/**
 * @author hacker
 *
 */
@RestController
public class HelloController {
	@Autowired
	private PersonService personService;
	
	@GetMapping(value="/find")
	Person findAll() {
		 Person p = personService.findById(1);
		 System.out.println(p);
		 return p;
		//return personService.findAll();
	}
	@GetMapping(value="/ff")
	List<Person> queryAll()
	{
		List<Person> list = personService.queryAll();
		return list;
	}
	/*@PutMapping(value="/add")
	public Result add (@Valid Person p,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()){
			System.out.println(bindingResult.getFieldError().getDefaultMessage());
			return null;
		}
		Result result = new Result();
		p.setAge(p.getAge());
		p.setpName(p.getpName());
		p.setContentc(p.getContent());
		result.setCode(100);
		result.setMesage("success");
		personService.save(p);
		return result;
	}*/
}
