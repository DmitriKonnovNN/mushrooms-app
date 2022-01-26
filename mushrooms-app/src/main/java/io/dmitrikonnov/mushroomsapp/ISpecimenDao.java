package io.dmitrikonnov.mushroomsapp;

import java.util.List;

public interface ISpecimenDao {
    Specimen save(Specimen specimen) throws Exception;

    List<Specimen> fetchAll();

    Specimen fetch(int id);

    void delete(int id);

    List<Specimen> fetchSpecimensByMushroomId(int mushroomId);
}
