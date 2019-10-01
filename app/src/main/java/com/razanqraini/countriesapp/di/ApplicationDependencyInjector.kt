package com.razanqraini.countriesapp.di

import android.content.Context
import com.razanqraini.countriesapp.adapters.BindingAdapters
import com.razanqraini.countriesapp.context.CountriesApplication
import com.razanqraini.countriesapp.di.viewmodel.ViewModelFactoryProvider

object ApplicationDependencyInjector {

    private fun getApplicationComponent(context: Context): ApplicationComponent =
        (context.applicationContext as CountriesApplication).applicationComponent

    fun inject(context: Context, instance: ViewModelFactoryProvider) =
        getApplicationComponent(context).inject(instance)

    fun inject(context: Context, instance: BindingAdapters) =
        getApplicationComponent(context).inject(instance)
}