package com.angelehl.springboot.utilizandospring;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@RequestMapping("/courses")
	public List<Curso> retrieveAllCourses(){
		
		return Arrays.asList(
				
				new Curso(1,"Learn AWS","angelehl"),
				new Curso(2,"Learn DevOps","angelehl")
				
				);
	}

}
