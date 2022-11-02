package com.iparcoc.mycookingrecipes.domain.useCases

import com.iparcoc.mycookingrecipes.domain.models.Recipe
import com.iparcoc.mycookingrecipes.domain.repositories.recipeRepository.RecipeRepositoryInterface

class GetRecipeUseCase(val recipeRepository: RecipeRepositoryInterface) : GetRecipeUseCaseInterface {

    override fun execute() : Recipe {
        return recipeRepository.getRecipe()
    }

}