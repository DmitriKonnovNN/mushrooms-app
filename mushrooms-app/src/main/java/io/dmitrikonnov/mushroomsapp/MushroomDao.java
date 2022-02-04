package io.dmitrikonnov.mushroomsapp;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Future;

@Repository
@AllArgsConstructor
public class MushroomDao implements IMushroomDao{


    @Override
    public void fetchMushroom(Callback<List<Mushroom>> callback,String combinedName) {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        IMushroomRetrofitClient retrofitClient = retrofitInstance.create(IMushroomRetrofitClient.class);
        Call<List<Mushroom>> call = retrofitClient.getMushrooms(combinedName);
        call.enqueue(callback);
    }



}
