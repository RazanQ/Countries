package com.razanqraini.countriesapp.di.net.countries

import com.razanqraini.countriesapp.di.net.countries.model.Country
import com.razanqraini.countriesapp.utils.ENDPOINT_COUNTRY
import retrofit2.Call
import retrofit2.http.GET

interface CountriesApis {

    @GET(ENDPOINT_COUNTRY)
    fun getCountries(): Call<List<Country>>
}