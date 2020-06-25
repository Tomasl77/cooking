package fr.formation.recipes.services;

import java.util.Set;

import fr.formation.recipes.dtos.views.IngredientsViewDto;

public interface IngredientService {

    Set<IngredientsViewDto> getAll();

    IngredientsViewDto getOne(Integer id);
}
