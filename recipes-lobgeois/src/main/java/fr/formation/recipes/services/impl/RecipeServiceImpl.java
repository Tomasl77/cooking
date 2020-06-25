package fr.formation.recipes.services.impl;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import fr.formation.recipes.dtos.PostRecipeDto;
import fr.formation.recipes.entities.Recipe;
import fr.formation.recipes.repositories.RecipeRepository;
import fr.formation.recipes.services.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository repository;

    protected RecipeServiceImpl(RecipeRepository repository) {
	this.repository = repository;
    }

    ModelMapper mapper = new ModelMapper();

    @Override
    public void create(@Valid PostRecipeDto dto) {
	Recipe recipe = mapper.map(dto, Recipe.class);
	repository.save(recipe);
    }
}
