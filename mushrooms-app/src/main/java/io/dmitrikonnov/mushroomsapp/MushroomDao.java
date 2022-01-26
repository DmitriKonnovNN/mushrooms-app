package io.dmitrikonnov.mushroomsapp;

import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Repository
public class MushroomDao implements IMushroomDao{
    @Override
    public List<Mushroom> fetchMushroom(String combinedName) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        IMushroomRetrofitDao mushroomRetrofitDao = retrofitInstance.create(IMushroomRetrofitDao.class);
        Call<List<Mushroom>> mushrooms = mushroomRetrofitDao.getMushrooms(combinedName);
        Callback<List<Mushroom>> mr = mushrooms.enqueue();
    }
}
