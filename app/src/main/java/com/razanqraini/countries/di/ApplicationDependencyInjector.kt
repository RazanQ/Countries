package com.razanqraini.countries.di

import android.content.Context
import com.razanqraini.countries.adapters.BindingAdapters
import com.razanqraini.countries.context.CountriesApplication
import com.razanqraini.countries.di.viewmodel.ViewModelFactoryProvider

object ApplicationDependencyInjector {

    private fun getApplicationComponent(context: Context): ApplicationComponent =
        (context.applicationContext as CountriesApplication).applicationComponent

    fun inject(context: Context, instance: ViewModelFactoryProvider) =
        getApplicationComponent(context).inject(instance)

    fun inject(context: Context, instance: BindingAdapters) =
        getApplicationComponent(context).inject(instance)
}