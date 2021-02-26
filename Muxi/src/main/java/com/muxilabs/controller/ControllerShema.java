package com.muxilabs.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.muxilabs.model.ModelShema;
import com.muxilabs.repository.RepositoryShema;


@RestController
@RequestMapping("/shema")
public class ControllerShema {

	
	@Autowired
	private RepositoryShema repository;
	
	
	@GetMapping
	public ResponseEntity <List<ModelShema>>getAll(){
		return ResponseEntity.ok(repository.findAll());
	
	}
}
