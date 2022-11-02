package com.iparcoc.mycookingrecipes.presentation.recipeDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.iparcoc.mycookingrecipes.R
import com.iparcoc.mycookingrecipes.data.dataSources.RecipeDataSource
import com.iparcoc.mycookingrecipes.data.repositories.recipeRepository.RecipeRepository
import com.iparcoc.mycookingrecipes.databinding.FragmentRecipeDetailBinding
import com.iparcoc.mycookingrecipes.domain.useCases.GetRecipeUseCase
import com.iparcoc.mycookingrecipes.domain.useCases.GetRecipeUseCaseInterface

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class RecipeDetailFragment : Fragment() {

    private var _binding: FragmentRecipeDetailBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRecipeDetailBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // revisar esta cosita --> Inyeccion de dependencias
        val recipeUseCase : GetRecipeUseCaseInterface = GetRecipeUseCase(RecipeRepository(RecipeDataSource()))
        println("Hola")
        println(recipeUseCase.execute().name)
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}