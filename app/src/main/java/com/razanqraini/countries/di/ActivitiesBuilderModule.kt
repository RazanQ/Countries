package com.razanqraini.countries.di

import com.razanqraini.countries.ui.countrieslist.CountriesActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@SuppressWarnings("unused")
@Module
abstract class ActivitiesBuilderModule {

    @ContributesAndroidInjector
    abstract fun countriesActivity(): CountriesActivity
}