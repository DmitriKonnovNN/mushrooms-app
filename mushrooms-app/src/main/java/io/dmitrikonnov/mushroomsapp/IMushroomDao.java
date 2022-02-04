package io.dmitrikonnov.mushroomsapp;

import retrofit2.Callback;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Future;

public interface IMushroomDao {
    void fetchMushroom(Callback<List<Mushroom>> callback,String combinedName) throws IOException;


}
