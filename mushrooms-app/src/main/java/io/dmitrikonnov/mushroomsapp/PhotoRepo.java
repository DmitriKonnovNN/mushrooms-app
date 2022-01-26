package io.dmitrikonnov.mushroomsapp;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PhotoRepo extends ReactiveCrudRepository<Photo, Integer> {

}
