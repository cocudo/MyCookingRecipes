package com.iparcoc.mycookingrecipes.data.models

import com.iparcoc.mycookingrecipes.domain.models.Recipe

class RecipeData(val name: String) {

    fun toDomain(): Recipe {
        return Recipe(name)
    }

}