package com.mess.phone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployController {

	
	@GetMapping("/listemploy")
public List<String> getListEmployee() {
		
		List<String>list =new ArrayList<>();
		list.add("ravi");
		list.add("karna");
		list.add("arjun");
		list.add("ramesh");
		
		
		return list;
}}
