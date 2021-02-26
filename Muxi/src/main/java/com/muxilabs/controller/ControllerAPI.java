package com.muxilabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.muxilabs.model.ModelAPI;
import com.muxilabs.repository.RepositoryAPI;



@RestController
@RequestMapping("/api")
public class ControllerAPI {
	
	
	
	@Autowired
	private RepositoryAPI repository;
	
	
	@GetMapping
	public ResponseEntity <List<ModelAPI>>getAll(){
		return ResponseEntity.ok(repository.findAll());
	
	}

	@GetMapping("/{version}/api/{logic}")
	public ResponseEntity <List<ModelAPI>>getVersionLogic(@PathVariable String version , @PathVariable int logic){
		return ResponseEntity.ok(repository.findAllByVersionAndLogic(version, logic));
		
	}
	
	@PostMapping("/post")
	public ModelAPI criar(@RequestBody ModelAPI api) {
		repository.save(api);
		return api;
	}
	
	//body 44332211;123;PWWIN;0;F04A2E4088B;4;8.00b3;0;16777216;PWWIN
	
	@PostMapping("/body")
	public ModelAPI criarBody(@RequestBody String body) {
		String texto = body;
		ModelAPI api  = new ModelAPI();
		String [] resp = texto.split(";");
		api.setLogic( Integer.parseInt(resp[0]));
		api.setSerial(resp[1]);
		api.setModel(resp[2]);
		api.setSam( Integer.parseInt(resp[3]));
		api.setPtid(resp[4]);
		api.setPlat( Integer.parseInt(resp[5]));
		api.setVersion(resp[6]);
		api.setMxr( Integer.parseInt(resp[7]));
		api.setMxf( Integer.parseInt(resp[8]));
		api.setVerfm(resp[9]);
		repository.save(api);
		return api;
		
		
	}
	
	@PutMapping("/{version}/api/{logic}")
	public ModelAPI putVersionLogic(@PathVariable String version , @PathVariable int logic,@RequestBody ModelAPI api){
	api.setVersion(version);
	api.setLogic(logic);
	repository.save(api);
		return api;
	
	
	
		
	}
	
	
	
	
	

}
