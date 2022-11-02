package com.iparcoc.mycookingrecipes.data.dataSources

import com.iparcoc.mycookingrecipes.data.models.RecipeData

class RecipeDataSource : RecipeDataSourceInterface {

    override fun getRecipe(): RecipeData {
        return RecipeData("Recipe 1")
    }

}

