package com.razanqraini.countries.di

import android.content.Context
import com.razanqraini.countries.context.CountriesApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Provides dependency objects like Retrofit, Utils, Context, Gson, etc
 */
@Module
class ApplicationModuleProvider {

    @Provides
    @Singleton
    fun provideApplicationContext(countriesApplication: CountriesApplication):
            Context = countriesApplication
}