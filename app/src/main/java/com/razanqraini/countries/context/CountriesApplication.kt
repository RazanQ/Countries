package com.razanqraini.countries.context

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.razanqraini.countries.di.ApplicationComponent
import com.razanqraini.countries.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/*
 * we use our AppComponent (now prefixed with Dagger)
 * to inject our Application class.
 * This way a DispatchingAndroidInjector is injected which is
 * then returned when an injector for an activity is requested.
 * */
class CountriesApplication : Application(), HasActivityInjector, HasSupportFragmentInjector {

    val applicationComponent: ApplicationComponent by lazy { initializeDaggerComponent() }

    @Inject
    lateinit var dispatchingAndroidInjectorActivity: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingAndroidInjectorFragment: DispatchingAndroidInjector<Fragment>

    override fun onCreate() {
        super.onCreate()

        applicationComponent.inject(this)
    }

    private fun initializeDaggerComponent() =
        DaggerApplicationComponent.builder()
            .application(this)
            .build()

    override fun activityInjector() = dispatchingAndroidInjectorActivity

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return dispatchingAndroidInjectorFragment
    }
}