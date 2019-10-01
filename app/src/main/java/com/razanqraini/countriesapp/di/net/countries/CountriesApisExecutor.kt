package com.razanqraini.countriesapp.di.net.countries

import com.razanqraini.countriesapp.di.net.countries.model.Country

interface CountriesApisExecutor {
    fun getCountries(countryList: List<Country>)
}