package com.dhoomilbsheta.authtest.oauth;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SmartBossAPI {

    @GET("Users/")
    Call<List<User>> loadChanges();
}
