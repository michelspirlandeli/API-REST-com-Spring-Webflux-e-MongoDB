package com.apirest.APIRESTcomSpringWebfluxeMongoDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.APIRESTcomSpringWebfluxeMongoDB.document.PlayList;
import com.apirest.APIRESTcomSpringWebfluxeMongoDB.service.PlayListService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class PlayListController {

	@Autowired
	PlayListService service;
	
	@GetMapping(value="/playlist")
	public Flux<PlayList> getPlaylist(){
		return service.findAll();
	}
	
	@GetMapping(value="/playlist/{id}")
	public Mono<PlayList> getPlaylistId(@PathVariable String id){
		return service.findById(id);
	}
	
	@PostMapping(value="/playlist")
	public Mono<PlayList> save(@RequestBody PlayList playlist){
		return service.save(playlist);
	}
	
}
