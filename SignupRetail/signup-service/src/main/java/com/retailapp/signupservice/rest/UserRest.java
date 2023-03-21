package com.retailapp.signupservice.rest;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@RequestMapping(path = "/user")
public interface UserRest {
	
@PostMapping(path = "/signup")
public ResponseEntity<String> signup(@RequestBody(required=true) Map<String,String>requestMap);

@GetMapping(path="/getCartId/{email}")
public ResponseEntity<Integer>getCartId(@PathVariable String email);

}
