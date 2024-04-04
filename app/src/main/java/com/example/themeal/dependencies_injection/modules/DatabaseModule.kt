package com.example.themeal.dependencies_injection.modules

import android.content.Context
import androidx.room.Room
import com.example.data.AppDatabase
import com.example.data.dao.CategoriesDao
import com.example.data.dao.MealsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
object DatabaseModule {

    @Provides
    @ViewModelScoped
    fun providesRoomDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            context = appContext,
            klass = AppDatabase::class.java,
            name = "food.db"
        ).build()
    }

    @Provides
    @ViewModelScoped
    fun providesMealsDao(appDatabase: AppDatabase): MealsDao {
        return appDatabase.mealsDao()
    }

    @Provides
    @ViewModelScoped
    fun providesCategoriesDao(appDatabase: AppDatabase): CategoriesDao {
        return appDatabase.categoriesDao()
    }
}