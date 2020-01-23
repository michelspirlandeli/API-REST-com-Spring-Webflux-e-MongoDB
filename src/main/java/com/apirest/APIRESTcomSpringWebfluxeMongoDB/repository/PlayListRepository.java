package com.apirest.APIRESTcomSpringWebfluxeMongoDB.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.APIRESTcomSpringWebfluxeMongoDB.document.PlayList;

public interface PlayListRepository extends ReactiveMongoRepository<PlayList, String>{

}
