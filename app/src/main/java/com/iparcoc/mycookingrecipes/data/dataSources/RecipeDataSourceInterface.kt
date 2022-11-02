package com.iparcoc.mycookingrecipes.data.dataSources

import com.iparcoc.mycookingrecipes.data.models.RecipeData

interface RecipeDataSourceInterface {

    fun getRecipe(): RecipeData

}