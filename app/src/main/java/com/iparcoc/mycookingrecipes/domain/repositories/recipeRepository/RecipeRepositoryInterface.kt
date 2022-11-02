package com.iparcoc.mycookingrecipes.domain.repositories.recipeRepository

import com.iparcoc.mycookingrecipes.domain.models.Recipe

interface RecipeRepositoryInterface {
    fun getRecipe(): Recipe
}