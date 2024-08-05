package com.curso.curso.resources;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.curso.entities.User;

@RestController
@RequestMapping(value = "/Users") // dando nome ao recurso
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){  
	
	User n = new User(1L, "Maria", "maria@gmail.com", "81-2127-0000", "12345");
	return ResponseEntity.ok().body(n);
 }
}