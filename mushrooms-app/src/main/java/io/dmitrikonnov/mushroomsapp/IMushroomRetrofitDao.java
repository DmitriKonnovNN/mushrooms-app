package io.dmitrikonnov.mushroomsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface IMushroomRetrofitDao {
    @GET("/observation")
    Call<List<Mushroom>> getMushrooms (@Query("Combined_Name") String combinedName);
}
