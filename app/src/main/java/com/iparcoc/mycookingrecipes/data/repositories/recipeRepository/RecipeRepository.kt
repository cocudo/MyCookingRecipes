package com.iparcoc.mycookingrecipes.data.repositories.recipeRepository

import com.iparcoc.mycookingrecipes.data.dataSources.RecipeDataSourceInterface
import com.iparcoc.mycookingrecipes.domain.models.Recipe
import com.iparcoc.mycookingrecipes.domain.repositories.recipeRepository.RecipeRepositoryInterface


class RecipeRepository(val recipeDataSource: RecipeDataSourceInterface) : RecipeRepositoryInterface {

    override fun getRecipe(): Recipe {
        return recipeDataSource.getRecipe().toDomain()
    }

}