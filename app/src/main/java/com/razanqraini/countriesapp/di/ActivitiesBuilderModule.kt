package com.razanqraini.countriesapp.di

import com.razanqraini.countriesapp.ui.countrieslist.CountriesActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@SuppressWarnings("unused")
@Module
abstract class ActivitiesBuilderModule {

    @ContributesAndroidInjector
    abstract fun countriesActivity(): CountriesActivity
}