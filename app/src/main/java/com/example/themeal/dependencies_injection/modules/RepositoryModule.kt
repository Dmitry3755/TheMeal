package com.example.themeal.dependencies_injection.modules

import com.example.data.repositories.local.CategoriesRepositoryDbImpl
import com.example.data.repositories.local.MealsRepositoryDbImpl
import com.example.data.repositories.network.CategoryRepositoryNetImpl
import com.example.data.repositories.network.MealRepositoryNetImpl
import com.example.domain.repositories.local.CategoriesRepositoryDb
import com.example.domain.repositories.local.MealsRepositoryDb
import com.example.domain.repositories.network.CategoryRepositoryNet
import com.example.domain.repositories.network.MealRepositoryNet
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Qualifier

@Qualifier
annotation class RepositoryNet

@Qualifier
annotation class RepositoryDb

@RepositoryNet
@Module(includes = [NetworkModule::class])
@InstallIn(ViewModelComponent::class)
abstract class NetworkRepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindsMealRepositoryNet(mealRepositoryNetImpl: MealRepositoryNetImpl): MealRepositoryNet

    @Binds
    @ViewModelScoped
    abstract fun bindsCategoryRepositoryNet(categoryRepositoryNetImpl: CategoryRepositoryNetImpl): CategoryRepositoryNet

}

@RepositoryDb
@Module(includes = [DatabaseModule::class])
@InstallIn(ViewModelComponent::class)
abstract class DatabaseRepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindsMealsRepositoryDb(mealsRepositoryDbImpl: MealsRepositoryDbImpl): MealsRepositoryDb

    @Binds
    @ViewModelScoped
    abstract fun bindsCategoriesRepositoryDb(categoriesRepositoryDbImpl: CategoriesRepositoryDbImpl): CategoriesRepositoryDb

}