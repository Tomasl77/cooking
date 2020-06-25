package fr.formation.recipes.services;

import javax.validation.Valid;

import fr.formation.recipes.dtos.PostRecipeDto;

public interface RecipeService {

    void create(@Valid PostRecipeDto recipeDto);
}
