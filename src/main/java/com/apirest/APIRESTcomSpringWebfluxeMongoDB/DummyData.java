package com.apirest.APIRESTcomSpringWebfluxeMongoDB;

//import java.util.UUID;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.apirest.APIRESTcomSpringWebfluxeMongoDB.document.PlayList;
//import com.apirest.APIRESTcomSpringWebfluxeMongoDB.repository.PlayListRepository;
//
//import reactor.core.publisher.Flux;

//@Component
//public class DummyData  implements CommandLineRunner{
//	
//	private final PlayListRepository playlistRepository;
//	
//    DummyData(PlayListRepository playlistRepository) {
//        this.playlistRepository = playlistRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//    	playlistRepository.deleteAll()
//                .thenMany(
//                        Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8",
//                                "Github", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
//                                .map(nome -> new PlayList(UUID.randomUUID().toString(), nome))
//                                .flatMap(playlistRepository::save))
//                .subscribe(System.out::println);
//    }
//
//
//}
