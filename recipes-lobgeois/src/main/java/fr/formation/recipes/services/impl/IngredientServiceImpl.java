package fr.formation.recipes.services.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import fr.formation.recipes.dtos.views.IngredientsViewDto;
import fr.formation.recipes.repositories.IngredientRepository;
import fr.formation.recipes.services.IngredientService;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository repository;

    protected IngredientServiceImpl(IngredientRepository repository) {
	this.repository = repository;
    }

    @Override
    public Set<IngredientsViewDto> getAll() {
	return repository.getAllProjectedBy();
    }

    @Override
    public IngredientsViewDto getOne(Integer id) {
	return repository.getByIdIngredient(id);
    }
}
