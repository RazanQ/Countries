package com.razanqraini.countries.di.viewmodel

import android.content.Context
import com.razanqraini.countries.di.ApplicationDependencyInjector
import javax.inject.Inject

class ViewModelFactoryProvider(context: Context) {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    init {
        ApplicationDependencyInjector.inject(context, this)
    }
}