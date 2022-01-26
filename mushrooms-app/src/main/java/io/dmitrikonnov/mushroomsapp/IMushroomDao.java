package io.dmitrikonnov.mushroomsapp;

import java.io.IOException;
import java.util.List;

public interface IMushroomDao {
    List<Mushroom> fetchMushroom(String combinedName) throws IOException;
}
