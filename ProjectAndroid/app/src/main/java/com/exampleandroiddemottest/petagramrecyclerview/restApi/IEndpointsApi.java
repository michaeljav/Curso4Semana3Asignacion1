package com.exampleandroiddemottest.petagramrecyclerview.restApi;

import com.exampleandroiddemottest.petagramrecyclerview.restApi.model.MascotaResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IEndpointsApi {

    @GET(ContantesRestApi.URL_GET_INFORMATION_USER)
    Call<MascotaResponse> getRecentMedia();
}
