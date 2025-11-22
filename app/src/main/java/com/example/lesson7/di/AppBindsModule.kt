package com.example.lesson7.di

import android.content.Context
import androidx.room.Room
import com.example.lesson7.data.TasksRepositoryImp
import com.example.lesson7.data.db.TasksDatabase
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
interface AppBindsModule {
    @Binds
    fun bindTasksRepository(impl: TasksRepositoryImp): TasksRepositoryImp


//    companion object {
//        @Provides
//        @Singleton
//        fun provideDb(context: Context): TasksDatabase =
//            Room.databaseBuilder(
//                context,
//                TasksDatabase::class.java,
//                "tasks.db"
//            ).build()
//    }
}