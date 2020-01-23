package com.apirest.APIRESTcomSpringWebfluxeMongoDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.APIRESTcomSpringWebfluxeMongoDB.document.PlayList;
import com.apirest.APIRESTcomSpringWebfluxeMongoDB.repository.PlayListRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlayListServiceImpl implements PlayListService{

	@Autowired
	PlayListRepository playListRepository;
	
	@Override
	public Flux<PlayList> findAll() {
		// TODO Auto-generated method stub
		return playListRepository.findAll();
	}

	@Override
	public Mono<PlayList> findById(String id) {
		// TODO Auto-generated method stub
		return playListRepository.findById(id);
	}

	@Override
	public Mono<PlayList> save(PlayList playlist) {
		// TODO Auto-generated method stub
		return playListRepository.save(playlist);
	}

}
