package com.example.lesson7.di

import android.app.Application
import com.example.lesson7.di.viewModel.ViewModelModule
import com.example.lesson7.presenter.MainFragment
import dagger.BindsInstance
import dagger.Component
import dagger.Module

@Component(
    modules = [AppModule::class]
)
abstract class AppComponent{
    abstract fun inject(fragment: MainFragment)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(app: Application): Builder
        fun build(): AppComponent
    }
}

@Module(
    includes = [
        AppBindsModule::class,
        ViewModelModule::class
    ]
)
class AppModule