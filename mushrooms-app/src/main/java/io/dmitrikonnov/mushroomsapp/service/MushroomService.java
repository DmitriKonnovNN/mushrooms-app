package io.dmitrikonnov.mushroomsapp.service;

import io.dmitrikonnov.mushroomsapp.IMushroomDao;
import io.dmitrikonnov.mushroomsapp.Mushroom;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.hibernate.engine.internal.Collections;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.LockSupport;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MushroomService {


    private final IMushroomDao mushroomDao;
    private final List<Mushroom> mushrooms;


    protected void executeManyTaskAsync (String combinedName){
        CompletableFuture.runAsync(()-> fetchMushrooms(combinedName)).
                thenRunAsync(()->{
                    int count=0;
                    for (int i = 0; i<10; i++)
                    {LockSupport.parkNanos(1000);
                    count++;}
                });
    }



    @SneakyThrows
    private void fetchMushrooms (String combinedName)  {
        mushroomDao.fetchMushroom(new Callback<>() {
            @Override
            public void onResponse(Call<List<Mushroom>> call, Response<List<Mushroom>> response) {
                if (response.isSuccessful()){
                    if(response.body()!= null) mushrooms.addAll(response.body());
                }else {
                    int httpErrorCode = response.code();
                }
            }
            @Override
            public void onFailure(Call<List<Mushroom>> call, Throwable t) {
                throw new RuntimeException("Couldn't make a call " + t.getMessage() );
            }
        }, combinedName);
    }


}
