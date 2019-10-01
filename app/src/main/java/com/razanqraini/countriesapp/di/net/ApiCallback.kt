package com.razanqraini.countriesapp.di.net

import androidx.annotation.Nullable

interface ApiCallback<Response, Error> {

    fun onSuccess(response: Response)

    fun onError(@Nullable error: Error)
}