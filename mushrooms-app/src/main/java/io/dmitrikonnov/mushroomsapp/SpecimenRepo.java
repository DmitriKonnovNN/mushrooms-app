package io.dmitrikonnov.mushroomsapp;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.List;

public interface SpecimenRepo extends ReactiveCrudRepository<Specimen,Integer> {
    List<Specimen> findByMushroomId(int mushroomId);
}
