package com.iparcoc.mycookingrecipes.domain.useCases

import com.iparcoc.mycookingrecipes.domain.models.Recipe

interface GetRecipeUseCaseInterface {
    fun execute(): Recipe
}