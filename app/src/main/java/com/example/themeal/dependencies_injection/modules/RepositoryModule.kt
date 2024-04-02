package com.example.themeal.dependencies_injection.modules

import com.example.data.repositories.network.CategoryRepositoryNetImpl
import com.example.data.repositories.network.MealRepositoryNetImpl
import com.example.domain.repositories.network.CategoryRepositoryNet
import com.example.domain.repositories.network.MealRepositoryNet
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

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